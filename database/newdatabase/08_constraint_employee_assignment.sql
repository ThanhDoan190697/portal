

alter table assignment add column employeeid bigint not null;
  alter  table assignment add  constraint fk_employee_assignment
  foreign key (employeeid) references employee(employeeid);

-- tao khoa tu project voi assignment
alter table assignment add column projectid bigint not null ;
alter  table  assignment add constraint fk_project_assignment
foreign key (projectid) references  project(projectid);