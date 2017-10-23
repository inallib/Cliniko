CREATE TABLE cliniko_dev.patient (id integer, name varchar(20),
email varchar(20), isdCode varchar(10), phone varchar(20),
dob varchar(10), age varchar(3), specialId varchar(20))


CREATE TABLE `cliniko_dev`.`result` (id integer, patientId integer,
testName varchar(20), normalRange varchar(10), result varchar(20),
remarks varchar(10), todate date)
ENGINE = InnoDB;

