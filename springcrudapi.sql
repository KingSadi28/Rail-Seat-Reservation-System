CREATE DATABASE railSystem;
USE railSystem;

CREATE TABLE rail_passenger
(
	pnr_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    age INT,
    gender VARCHAR(255),
    aadhaar VARCHAR(255),
    mobile_number VARCHAR(255)
);