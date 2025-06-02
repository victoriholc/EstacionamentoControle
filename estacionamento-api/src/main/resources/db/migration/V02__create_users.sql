CREATE TYPE user_role_enum AS ENUM ('ADMIN', 'USER');

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(100) UNIQUE NOT NULL CHECK (trim(username) <> ''),
    password VARCHAR(255) NOT NULL CHECK (trim(password) <> ''),
    email VARCHAR(255) UNIQUE NOT NULL CHECK (trim(email) <> ''),
    user_role user_role_enum NOT NULL
);