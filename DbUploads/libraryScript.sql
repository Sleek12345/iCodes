-- create database library;
-- create table --
/** 
create table table_name (
column  name and datatype optional constriant,
column  name and datatype optional constriant,
column  name and datatype optional constriant,
............
constriant constriant_name constriant_type(column_name)
); **/
use library;
/**
 create table Users (
UserId             Integer              NOT NULL,
FullName           varchar(60)          NOT NULL,
Gender             varchar(60)      	NOT NULL,
Address            varchar(60)          NOT NULL,
ContactNumber      varchar(60)          NOT NULL,
constraint         Users_PK			    PRIMARY KEY(UserId)
);


 create table Books  (
 BookId          Integer                 NOT NULL,
 BookName        varchar(50)           NOT NULL,
 BookAuthor      varchar(35)           NOT NULL,
 constraint       Books_PK              PRIMARY KEY(BookId)
 
 ); 
 
/**
 create table Book_On_Loan  (
LoanId             Integer                NOT NULL,
DateCollected    date                 NOT NULL,
DateReturned     varchar(35)              NOT NULL,
userId           Integer                  NOT NULL,
StaffId          Integer                  NOT NULL,
BookId           Integer                  NOT NULL,
constraint      BookOnLoan_PK         PRIMARY KEY(LoanId),
constraint     BookOnLoan_Users_FK         foreign key(UserId)
                  references          Users(UserId),
constraint      BookOnLoan_Staff_FK   foreign key(StaffId)
                  references          Staff(StaffId),
constraint      BookOnLoan_Book_FK    foreign key(BookId)
                  references          Books(BookId)
); 
**/

create table Staff (
 StaffId            Integer            NOT NULL,
 FullName           varchar(40)        NOT NULL,
 EmailAddress       varchar(45)        NOT NULL,
 PhoneNumber		varchar(45)           NOT NULL,
 Address            varchar(45)        NOT NULL,
 Job                varchar(45)        NOT NULL,
 constraint         Staff_Id_PK        primary key(StaffId)
);

