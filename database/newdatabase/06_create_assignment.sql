create table assignment(
    assignmentid bigint not null auto_increment primary key ,
    formdate timestamp,
    enddate timestamp,
    workload int,
    assigmentcost int,
    rate int
  )