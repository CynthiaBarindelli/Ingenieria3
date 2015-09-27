CREATE DATABASE IF NOT EXISTS farmaciasyadb;

show databases;

use farmaciasyadb;

CREATE TABLE USER (
	USER_ID  int NOT NULL AUTO_INCREMENT,
    USERNAME varchar(50) not null,
    PASSWORD varchar(50) not null,
    EMAIL varchar(100) not null,
    NAME varchar(100) null,
    LASTNAME varchar(100) null,
    ADDRESS varchar(300) not null,
    CREATED_DATE DATETIME,
    PRIMARY KEY (USER_ID)
);

CREATE TRIGGER automate_created_date_user BEFORE INSERT ON  USER 
FOR EACH ROW 
SET NEW.CREATED_DATE = NOW()