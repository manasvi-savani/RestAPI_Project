CREATE TABLE `conygre`.`users_table` (
                                         `id` INT NOT NULL,
                                         `Name` VARCHAR(45) NOT NULL,
                                         `Cash_value` DOUBLE NOT NULL,
                                         `Investment_value` DOUBLE NOT NULL,
                                         `Net_worth` DOUBLE NOT NULL,
                                         PRIMARY KEY (`id`),
                                         UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

INSERT INTO `conygre`.`users_table` (`id`, `Name`, `Cash_value`, `Investment_value`, `Net_worth`) VALUES ('1', 'John Smith', '1000', '500', '1500');
INSERT INTO `conygre`.`users_table` (`id`, `Name`, `Cash_value`, `Investment_value`, `Net_worth`) VALUES ('2', 'Jane Doe', '2053', '749', '10000');
INSERT INTO `conygre`.`users_table` (`id`, `Name`, `Cash_value`, `Investment_value`, `Net_worth`) VALUES ('3', 'Gary Snowball', '5784', '2053', '15000');

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
                              totalGainLoss double not null,
                              FOREIGN KEY (user_id) REFERENCES users_table(id)

);

INSERT INTO `conygre`.`stocks_table` (`id`, `user_id`, `stock_name`, `quantity`, `sale_price`, `current_price`, `open_price`, `close_price`, `cost`, `market_value`,`totalGainLoss`) VALUES ('1', '1', 'WFC', '3', '50.00', '45.25', '51.72', '48.79', '52.39', '13.76', '13.76');
INSERT INTO `conygre`.`stocks_table` (`id`, `user_id`, `stock_name`, `quantity`, `sale_price`, `current_price`, `open_price`, `close_price`,  `cost`, `market_value`, `totalGainLoss`) VALUES ('2', '2', 'DIS', '5', '42.44', '40.98', '39.88', '41.12', '40.98', '3.00', '13.76');
INSERT INTO `conygre`.`stocks_table` (`id`, `user_id`, `stock_name`, `quantity`,`sale_price`, `current_price`, `open_price`, `close_price`, `cost`, `market_value`, `totalGainLoss`) VALUES ('3', '3', 'JPM', '2', '56.76', '34.33', '45.80', '43.12', '39.90', '5.00', '13.76');
