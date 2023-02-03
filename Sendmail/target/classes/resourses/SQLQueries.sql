CREATE TABLE `xworkz-odc-btm`.`resort_jpa` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `location` VARCHAR(45) NULL,
  `checkInTime` TIME NULL,
  `checkOutTime` TIME NULL,
  `createdBy` VARCHAR(45) NULL,
  `createdDate` DATE NULL,
  `updatedDate` DATE NULL,
  `ownerName` VARCHAR(45) NULL,
  `pricePerDay` DOUBLE NULL,
  PRIMARY KEY (`id`));
  
  desc resort_jpa;