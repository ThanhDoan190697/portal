create table project(
  id bigint not null  auto_increment primary key ,
  projectname nchar(150),
  startdate timestamp,
  enddate timestamp,
  pudget int,
  remark nvarchar(255),
  projectcost int,
  profit int
);
alter table project drop  column id;
alter  table project add projectid bigint not null  auto_increment primary key ;