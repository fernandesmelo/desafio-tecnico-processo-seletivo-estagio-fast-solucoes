-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema desafio_fast
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema desafio_fast
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `desafio_fast` DEFAULT CHARACTER SET utf8 ;
USE `desafio_fast` ;

-- -----------------------------------------------------
-- Table `desafio_fast`.`colaboradores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desafio_fast`.`colaboradores` (
  `idColaboradores` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `departamento` VARCHAR(45) NOT NULL,
  `cargo` VARCHAR(70) NOT NULL,
  PRIMARY KEY (`idColaboradores`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `desafio_fast`.`workshops`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desafio_fast`.`workshops` (
  `idWorkshops` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `data` DATE NOT NULL,
  `descricao` VARCHAR(500) NULL,
  `local` VARCHAR(150) NOT NULL,
  `hora_inicio` TIME NOT NULL,
  `hora_fim` TIME NOT NULL,
  PRIMARY KEY (`idWorkshops`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `desafio_fast`.`ata_presenca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desafio_fast`.`ata_presenca` (
  `idAta_presenca` INT NOT NULL AUTO_INCREMENT,
  `data_registro` DATE NOT NULL,
  `observacoes` VARCHAR(45) NULL,
  `presente` TINYINT(1) NOT NULL,
  `feedbacks` VARCHAR(500) NULL,
  `Workshops_idWorkshops` INT NOT NULL,
  PRIMARY KEY (`idAta_presenca`),
  INDEX `fk_Ata de Presença_Workshops1_idx` (`Workshops_idWorkshops` ASC) VISIBLE,
  CONSTRAINT `fk_Ata de Presença_Workshops1`
    FOREIGN KEY (`Workshops_idWorkshops`)
    REFERENCES `desafio_fast`.`workshops` (`idWorkshops`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `desafio_fast`.`ata_presenca_colaboradores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `desafio_fast`.`ata_presenca_colaboradores` (
  `ata_presenca_idAta_presenca` INT NOT NULL,
  `colaboradores_idColaboradores` INT NOT NULL,
  PRIMARY KEY (`ata_presenca_idAta_presenca`, `colaboradores_idColaboradores`),
  INDEX `fk_Ata de Presença_has_Colaboradores_Colaboradores1_idx` (`colaboradores_idColaboradores` ASC) VISIBLE,
  INDEX `fk_Ata de Presença_has_Colaboradores_Ata de Presença1_idx` (`ata_presenca_idAta_presenca` ASC) VISIBLE,
  CONSTRAINT `fk_Ata de Presença_has_Colaboradores_Ata de Presença1`
    FOREIGN KEY (`ata_presenca_idAta_presenca`)
    REFERENCES `desafio_fast`.`ata_presenca` (`idAta_presenca`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ata de Presença_has_Colaboradores_Colaboradores1`
    FOREIGN KEY (`colaboradores_idColaboradores`)
    REFERENCES `desafio_fast`.`colaboradores` (`idColaboradores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
