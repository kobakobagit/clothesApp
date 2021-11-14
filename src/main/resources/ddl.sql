CREATE DATABASE clothes;

USE clothes;

CREATE TABLE shopping_record(
  buy_day DATE not null,
  place VARCHAR(30) not null,
  name VARCHAR(50) not null,
  price int,
  primary key(name)
);