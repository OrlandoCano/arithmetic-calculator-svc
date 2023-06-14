drop table if exists USERS;
drop table if exists OPERATIONS;
drop table if exists RECORDS;


create table USERS(
    ID int not null AUTO_INCREMENT,
    USERNAME varchar(100) not null,
    PASSWORD varchar(100) not null,
    STATUS varchar(20) not null,
    PRIMARY KEY (ID)
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