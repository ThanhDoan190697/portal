 create table user(
userid bigint auto_increment not null primary key ,
firstname varchar(100),
lastname varchar(100),
createddate timestamp,
quitdate timestamp,
login varchar(100),
password varchar(50)
);


