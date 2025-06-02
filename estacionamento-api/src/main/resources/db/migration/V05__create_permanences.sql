CREATE TABLE permanences (
    id SERIAL PRIMARY KEY,
    entry_time TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    exit_time TIMESTAMP WITHOUT TIME ZONE,
    car_id INTEGER NOT NULL,
    parking_spot_id INTEGER NOT NULL,
    CONSTRAINT fk_car FOREIGN KEY(car_id) REFERENCES cars(id),
    CONSTRAINT fk_parking_spot FOREIGN KEY(parking_spot_id) REFERENCES parking_spots(id)
);