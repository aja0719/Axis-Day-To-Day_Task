-- use studentlist;

-- /* create table college(clgname CHAR(255), clgplace CHAR(255), cldId int); */

--  insert into college(clgname,clgplace,cldId) values('DPCOE','Pune',6040),('AISSMS','DP ROAD',1177);

use banksystem;

-- create table bank(bnkName CHAR(255), bnkCode VARCHAR(255), bnkAdrs CHAR(255));

-- INSERT INTO bank(bnkName,bnkCode,bnkAdrs) VALUES('RBI','RBI7711','Mumbai');

-- create table bankbranch(branch_name CHAR(255), branch_place CHAR(255), branchId VARCHAR(255));

-- insert into bankbranch(branch_name,branch_place,branchId) values ('Axis','Mumbai','AXIS412');

-- CREATE TABLE atm(deposit BOOLEAN , withdraw BOOLEAN , chekbalnc BOOLEAN);

-- create table account(accntId int auto_increment primary key, accntNum bigint unique not null,accntbalnc float not null,accntType CHAR(255) not null,id int ,foreign key(id) references customerinfo(id));

-- CREATE TABLE bankbank(bnkName CHAR(255), bnkID int auto_increment PRIMARY KEY, bnkAdrs CHAR(255));

-- alter table account ADD CONSTRAINT bnkID foreign key(bnkID)references bankbank(bnkID);
-- alter table account ADD bnkID int;

-- CREATE TABLE Transaction(trnsID int auto_increment PRIMARY KEY,trns_amount float,trnsType VARCHAR(255),curntbalnc float,trnsDate DATE);
-- alter table TRANSACTION ADD id int;

alter table TRANSACTION ADD CONSTRAINT id foreign key(id)references customerinfo(id);