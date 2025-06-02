CREATE TABLE cars (
    id SERIAL PRIMARY KEY,
    plate VARCHAR(20) UNIQUE NOT NULL CHECK (trim(first_name) <> '',
    model VARCHAR(100) NOT NULL CHECK (trim(first_name) <> '',
    color VARCHAR(50) NOT NULL CHECK (trim(first_name) <> '',
    brand VARCHAR(50) NOT NULL CHECK (trim(first_name) <> '',
    owner_id INTEGER NOT NULL,
    CONSTRAINT fk_owner FOREIGN KEY(owner_id) REFERENCES owners(id)
);

INSERT INTO cars (id, plate, model, color, brand, owner_id) VALUES ('NEX-8237', 'Sedan', 'Azul', 'Toyota', '822ee87e-83ec-11ee-b962-0242ac120002');
INSERT INTO cars (id, plate, model, color, brand, owner_id) VALUES ('KNG-2830', 'SUV', 'Preto', 'Honda', '875e800c-83ec-11ee-b962-0242ac120002');
INSERT INTO cars (id, plate, model, color, brand, owner_id) VALUES ('FTD-5304', 'Hatchback', 'Branco', 'Volkswagen', '8a2ef032-83ec-11ee-b962-0242ac120002');
INSERT INTO cars (id, plate, model, color, brand, owner_id) VALUES ('MPP-8609', 'Caminhonete', 'Vermelho', 'Chevrolet', '822ee87e-83ec-11ee-b962-0242ac120002');
INSERT INTO cars (id, plate, model, color, brand, owner_id) VALUES ('JGS-7007', 'Sedan', 'Prata', 'Ford', '8a2ef032-83ec-11ee-b962-0242ac120002');