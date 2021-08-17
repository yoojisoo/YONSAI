-- 스키마 jdbctest 생성
CREATE SCHEMA `jdbctest` 
DEFAULT CHARACTER SET utf8 ; 

-- 
use jdbctest;
--
CREATE TABLE `jdbctest`.`test01` (
  `tno` INT NOT NULL AUTO_INCREMENT,
  `pname` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,test01
  `etc` VARCHAR(45) NULL,
  PRIMARY KEY (`tno`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO `jdbctest`.`test01` (`pname`, `age`, `etc`) VALUES ('홍길동', '22', '비고1');
INSERT INTO `jdbctest`.`test01` (`pname`, `age`, `etc`) VALUES ('장실산', '34', '비고2');
INSERT INTO `jdbctest`.`test01` (`pname`, `age`, `etc`) VALUES ('강감찬', '28', '비고3');
INSERT INTO `jdbctest`.`test01` (`pname`, `age`, `etc`) VALUES ('나해준', '25', '비고4');
INSERT INTO `jdbctest`.`test01` (`pname`, `age`, `etc`) VALUES ('박진우', '26', '비고5');
INSERT INTO `jdbctest`.`test01` (`pname`, `age`, `etc`) VALUES ('위지윤', '19', '비고6');
INSERT INTO `jdbctest`.`test01` (`pname`, `age`, `etc`) VALUES ('정민석', '49', '비고7');
