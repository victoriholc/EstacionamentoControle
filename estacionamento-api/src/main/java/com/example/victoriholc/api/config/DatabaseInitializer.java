package com.example.victoriholc.api.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class DatabaseInitializer {
	
    // These values come from application.properties
    @Value("${spring.datasource.url}")
    private String targetDataSourceUrl;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    /**
     * This runner creates the target database if it doesn't exist.
     * It connects to the default "postgres" database.
     */
    @Bean
    @Order(1)
    public ApplicationRunner createDatabaseRunner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                // Derive the target database name from the targetDataSourceUrl.
                String targetDatabase = targetDataSourceUrl.substring(targetDataSourceUrl.lastIndexOf('/') + 1);
                // Replace the database name in the URL with the default database, e.g., "postgres"
                String defaultUrl = targetDataSourceUrl.replace("/" + targetDatabase, "/postgres");

                try (Connection conn = DriverManager.getConnection(defaultUrl, username, password);
            		Statement stmt = conn.createStatement()) {
                    // Attempt to create the target database
                    String sql = "CREATE DATABASE " + targetDatabase;
                    stmt.executeUpdate(sql);
                    System.out.println("Database '" + targetDatabase + "' created successfully.");
                } catch (Exception e) {
                    // If the database already exists, you'll likely get an error message which you can ignore.
                    System.out.println("Database '" + targetDatabase + "' might already exist: " + e.getMessage());
                }
            }
        };
    }

    /**
     * This runner runs Flyway migrations programmatically after the database is ensured to exist.
     */
    @Bean
    @Order(2)
    public ApplicationRunner flywayMigrationRunner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                // Configure Flyway with the target datasource (the newly created database)
                Flyway flyway = Flyway.configure()
                        .dataSource(targetDataSourceUrl, username, password)
                        .baselineOnMigrate(true)  // Helpful if the database is non-empty
                        .load();
                // Run migrations from src/main/resources/db/migration/
                flyway.migrate();
                System.out.println("Flyway migrations executed.");
            }
        };
    }

}
