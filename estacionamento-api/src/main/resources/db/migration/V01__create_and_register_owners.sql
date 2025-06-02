CREATE TABLE owners (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL CHECK (trim(first_name) <> ''),
    last_name VARCHAR(100) NOT NULL CHECK (trim(first_name) <> ''),
    email VARCHAR(255) UNIQUE NOT NULL CHECK (trim(first_name) <> ''),
    phone VARCHAR(20) UNIQUE NOT NULL CHECK (trim(first_name) <> '')
);

INSERT INTO owners (id, first_name, last_name, email, phone) VALUES ('822ee87e-83ec-11ee-b962-0242ac120002', 'Diogo', 'Dias', 'diogo@email.com', '(79) 97827-4385');
INSERT INTO owners (id, first_name, last_name, email, phone) VALUES ('875e800c-83ec-11ee-b962-0242ac120002', 'Ana', 'Souza', 'ana@email.com', '(81) 84617-5428');
INSERT INTO owners (id, first_name, last_name, email, phone) VALUES ('8a2ef032-83ec-11ee-b962-0242ac120002', 'Rafael', 'Oliveira', 'rafael@email.com', '(17) 98728-6303');