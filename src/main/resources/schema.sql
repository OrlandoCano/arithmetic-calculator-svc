drop table if exists USERS;
drop table if exists USER_ROLES;
drop table if exists OPERATIONS;
drop table if exists RECORDS;



CREATE  TABLE USERS (
    USERNAME VARCHAR(45) NOT NULL ,
    PASSWORD VARCHAR(60) NOT NULL ,
    ENABLED TINYINT NOT NULL DEFAULT 1 ,
    PRIMARY KEY (USERNAME));

CREATE TABLE USER_ROLES (
    USER_ROLE_ID 	int not null AUTO_INCREMENT,
    USERNAME 		VARCHAR(45) NOT NULL,
    ROLENAME 		VARCHAR(45) NOT NULL,
    PRIMARY KEY (USER_ROLE_ID)
);

create table OPERATIONS(
    ID int not null AUTO_INCREMENT,
    TYPE varchar(50) not null,
    COST float not null,
    PRIMARY KEY (ID)
);

create table RECORDS(
    ID int not null AUTO_INCREMENT,
    OPERATION_ID UUID not null,
    USER_ID int not null,
    AMOUNT float not null,
    USER_BALANCE float not null,
    OPERATION_RESPONSE varchar(150) not null,
    CREATED_DATE TIMESTAMP not null,
    PRIMARY KEY (ID)
);

ALTER TABLE USER_ROLES ADD CONSTRAINT FK_USERNAME_IDX FOREIGN KEY (USERNAME) REFERENCES USERS (USERNAME);
