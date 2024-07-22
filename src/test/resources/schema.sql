CREATE SCHEMA IF NOT EXISTS POS;

CREATE TABLE IF NOT EXISTS POS.TRANSACTIONS (
  `receipt` int NOT NULL AUTO_INCREMENT,
  `payment` varchar(100) NOT NULL,
  `method` varchar(100) NOT NULL,
  `date` date NOT NULL,

  PRIMARY KEY (`receipt`)
  
);

CREATE TABLE IF NOT EXISTS POS.INVENTORY (
  `sku` int NOT NULL AUTO_INCREMENT,
  `available` varchar(100) NOT NULL,
  `cost` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,

  PRIMARY KEY (`SKU`)
  
);