drop database if exists sampledb2;
create database sampledb2;
use sampledb2;

create table sample2_table(
user_number int,
user_name varchar(50),
user_age int,
user_mail varchar(50)
);

insert into sample2_table values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into sample2_table values(2,"Sato",39,"yyy@google.com");
insert into sample2_table values(3,"Harada",44,"zzz@yahoo.co.jp");