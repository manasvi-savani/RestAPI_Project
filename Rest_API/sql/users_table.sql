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

