DROP DATABASE IF EXISTS currency;
CREATE DATABASE currency;
USE currency;

CREATE TABLE CURRENCY
(
    abbreviation    VARCHAR(3)  NOT NULL,
    name            VARCHAR(30) NOT NULL,
    conversion_rate FLOAT       NOT NULL,
    PRIMARY KEY (abbreviation)
);

INSERT INTO CURRENCY (abbreviation, name, conversion_rate)
VALUES ("USD", "United States Dollar", 1.00),
       ("EUR", "Euro", 1.17),
       ("GBP", "British Pound", 1.34),
       ("JPY", "Japanese Yen", 0.0091),
       ("CHF", "Swiss Franc", 1.10),
       ("CAD", "Canadian Dollar", 0.79),
       ("AUD", "Australian Dollar", 0.74),
       ("CNY", "Chinese Yuan", 0.15);
