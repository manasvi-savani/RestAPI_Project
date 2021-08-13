CREATE TABLE `conygre`.`users_table` (
                                         `id` INT NOT NULL,
                                         `Name` VARCHAR(45) NOT NULL,
                                         `Cash_value` DOUBLE NOT NULL,
                                         `Investment_value` DOUBLE NOT NULL,
                                         `Net_worth` DOUBLE NOT NULL,
                                         PRIMARY KEY (`id`),
                                         UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
