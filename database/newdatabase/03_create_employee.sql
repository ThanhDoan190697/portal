create table employee(
  id bigint  not null  auto_increment primary key,
  firstname nvarchar(50),
  lastname nvarchar(50),
  birthday timestamp,
  address nvarchar(100),
  email varchar(100),
  phone varchar(50),
  currentSalary int,
  hireDate timestamp,
  quitDate timestamp
)
alter table employee add  column  currentworkload nvarchar(255);
alter table employee add  column  currentpointprojectnumber int;
alter table employee add  column  jointprojectnumber int;
alter  table  employee add  column  userid bigint not null ;
alter  table  employee add  column  userid bigint not null ;
 alter table employee drop  column id;
alter table employee add  employeeid bigint not null  auto_increment primary key ;
alter table employee add  column avatarfile blob;

alter  table user add column
alter  table  e