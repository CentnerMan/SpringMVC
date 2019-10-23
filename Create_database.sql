CREATE SCHEMA `spring_shop` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;

USE `spring_shop`;

CREATE TABLE `spring_shop`.`customers` (
  `id` INT(8) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE);

CREATE TABLE `spring_shop`.`products` (
  `id` INT(8) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `cost` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `title_UNIQUE` (`title` ASC) VISIBLE);

CREATE TABLE `spring_shop`.`purchases` (
  `id` INT(8) NOT NULL AUTO_INCREMENT,
  `customer` INT(8) NOT NULL,
  `product` INT(8) NOT NULL,
  `purchase_price` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

INSERT INTO `spring_shop`.`customers` (`name`) VALUES ('Арнольд'), ('Иван'), ('Мария'), ('Сергей'), ('Татьяна'), ('Ольга'), ('Тарас'), ('Гиви');

INSERT INTO `spring_shop`.`products` (`title`, `cost`) VALUES ('Чемодан', '1000');
INSERT INTO `spring_shop`.`products` (`title`, `cost`) VALUES ('Сундук', '2000');
INSERT INTO `spring_shop`.`products` (`title`, `cost`) VALUES ('Портфель', '3000');
INSERT INTO `spring_shop`.`products` (`title`, `cost`) VALUES ('Кошёлка', '1000');
