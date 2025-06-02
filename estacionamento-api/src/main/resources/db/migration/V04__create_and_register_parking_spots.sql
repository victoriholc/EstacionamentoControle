CREATE TABLE parking_spots (
    id SERIAL PRIMARY KEY,
    number INTEGER UNIQUE NOT NULL CHECK (number >= 1),
    is_occupied BOOLEAN DEFAULT TRUE
);

INSERT INTO parking_spots (number, is_occupied) VALUES (1, false);
INSERT INTO parking_spots (number, is_occupied) VALUES (2, false);
INSERT INTO parking_spots (number, is_occupied) VALUES (3, false);
INSERT INTO parking_spots (number, is_occupied) VALUES (4, false);
INSERT INTO parking_spots (number, is_occupied) VALUES (5, false);