create table `jee`.`user` (
id int(11),
firstName varchar(20),
lastName varchar(20),
userName varchar(20),
password varchar(40),
constraint user_pk primary key (id),
constraint app_user_uk unique (userName)
);