CREATE DATABASE `GAMEBAR`;
USE categories`gamebar`;

CREATE TABLE `employees` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`first_name` VARCHAR(30) NOT NULL,
`last_name` VARCHAR(30) NOT NULL
);

CREATE TABLE `categories` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(40) NOT NULL
);

CREATE TABLE `products` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(40) NOT NULL,
`category_id` INT
);

INSERT INTO `employees`
VALUE 
(1, 'Pesho', 'Peshov'),
(2, 'Gosho', 'Goshov'),
(3, 'Ivan', 'Ivanov');

SELECT * FROM `employees`;

ALTER TABLE `employees`
ADD COLUMN `middle_name` VARCHAR(40);

ALTER TABLE `products`
ADD CONSTRAINT fk_products_categories
FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`);

ALTER TABLE `employees`
CHANGE COLUMN `middle_name` `middle_name` VARCHAR(100);