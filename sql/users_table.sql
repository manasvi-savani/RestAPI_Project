USE conygre;
DROP TABLE stocks_table;
DROP TABLE users_table;

CREATE TABLE `conygre`.`users_table` (
                                         `id` INT NOT NULL auto_increment,
                                         `Name` VARCHAR(45) NOT NULL,
                                         `Cash_value` DOUBLE NOT NULL,
                                         `Investment_value` DOUBLE NOT NULL,
                                         `Net_worth` DOUBLE NOT NULL,
                                         PRIMARY KEY (`id`))
;

INSERT INTO `conygre`.`users_table` (`id`, `Name`, `Cash_value`, `Investment_value`, `Net_worth`) VALUES ('1', 'John Smith', '1000', '500', '1500');


CREATE TABLE stocks_table (
                              id int primary key auto_increment,
                              user_id int not null,
                              stock_name VARCHAR(45),
                              quantity int not null,
                              sale_price double not null,
                              current_price double not null,
                              open_price double not null,
                              close_price double not null,
                              cost double not null,
                              market_value double not null,
                              gain_loss double not null,
                              FOREIGN KEY (user_id) REFERENCES users_table(id)

);

CREATE TABLE transaction_table (
                                   id int primary key auto_increment,
                                   user_id int not null,
                                   stock_id int not null,
                                   stock_name VARCHAR(45),
                                   transaction_type VARCHAR(4),
                                   quantity int not null,
                                   transaction_date VARCHAR(45),
                                   FOREIGN KEY (user_id) REFERENCES users_table(id),
                                   FOREIGN KEY (stock_id) REFERENCES stocks_table(id)


);

INSERT INTO `conygre`.`transaction_table` (`id`, `user_id`, `stock_id`, `stock_name`, `transaction_type`, `quantity`, `transaction_date`) VALUES ('1', '1', '2', 'DIS', 'BUY', '3', '2021-8-25');

use conygre;
INSERT INTO stocks_table  VALUES ('1', '1', 'WFC', '3', '50.00', '45.25','51.72', '48.79', '52.39', '13.76','679');



DROP TRIGGER IF EXISTS `conygre`.`users_table_BEFORE_DELETE`;

DELIMITER $$
USE `conygre`$$
CREATE TRIGGER `users_table_BEFORE_DELETE` BEFORE DELETE ON `users_table` FOR EACH ROW BEGIN
    DELETE FROM stocks_table where user_id = OLD.id;
    END$$
    DELIMITER ;

    INSERT INTO stocks_table  VALUES ('5', '1', 'WFC', '3', '50.00', '40.54','51.72', '39.45', '52.39', '13.76','679');
    INSERT INTO stocks_table  VALUES ('4', '1', 'WFC', '3', '50.00', '78.35','51.72', '78.59', '52.39', '13.76','679');
    INSERT INTO stocks_table  VALUES ('6', '1', 'WFC', '3', '50.00', '4.75','51.72', '4.23', '52.39', '13.76','679');
    INSERT INTO stocks_table  VALUES ('7', '1', 'WFC', '3', '50.00', '46.32','51.72', '44.43', '52.39', '13.76','679');
    INSERT INTO stocks_table  VALUES ('8', '1', 'WFC', '3', '50.00', '78.35','51.72', '71.43', '52.39', '13.76','679');

