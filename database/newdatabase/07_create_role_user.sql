create table role_user(
  roleid bigint,
  userid bigint ,
  constraint fk_role_user primary key (roleid,userid),
  constraint fk_role_user foreign key (userid) references user(userid),
  constraint fp_user_role foreign key (roleid) references role(roleid)
)