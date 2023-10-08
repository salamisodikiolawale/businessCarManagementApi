CREATE OR REPLACE TABLE IF NOT EXISTS CAR (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    licence_plate VARCHAR(11) NOT NULL ,
    licence_plate_number VARCHAR(5) NOT NULL ,
    licence_plate_letters VARCHAR(2) NOT NULL ,
    city_identification_number VARCHAR(2) NOT NULL ,
    serial_number VARCHAR(17) NOT NULL ,
    transport_type VARCHAR(50) NOT NULL ,
    driver_number VARCHAR(1) NOT NULL ,
    color VARCHAR
);

CREATE OR REPLACE TABLE IF NOT EXISTS DRIVER (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    first_name VARCHAR NOT NULL ,
    last_name VARCHAR NOT NULL ,
    birthday VARCHAR NOT NULL ,
    experience_driving_number VARCHAR NOT NULL ,
    cell_phone VARCHAR NOT NULL ,
    address VARCHAR NOT NULL
);

CREATE OR REPLACE TABLE IF NOT EXISTS DRIVER_CAR(
    car_id BIGINT NOT NULL ,
    driver_id BIGINT NOT NULL ,
    PRIMARY KEY (car_id, driver_id) ,
    FOREIGN KEY (car_id) REFERENCES car(id) ,
    FOREIGN KEY (driver_id) REFERENCES driver(id) ,
    associated_date DATE NOT NULL
);

