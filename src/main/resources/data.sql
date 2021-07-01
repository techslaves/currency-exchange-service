DROP TABLE IF EXISTS exchange_value;

CREATE TABLE exchange_value (
  id INT PRIMARY KEY,
  currency_from VARCHAR(250) NOT NULL,
  currency_to VARCHAR(250) NOT NULL,
  conversion_multiple VARCHAR(250) DEFAULT NULL,
  port INT NOT NULL
);

insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) values(10001,'USD','INR',65,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) values(10002,'EUR','INR',55,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) values(10003,'AUD','INR',50,0);
insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) values(10004,'RUPEE','INR',25,0);