drop database HMS;
create database HMS;
use HMS;

#---****************-----Creating tables for HMS----***********------#

#--------creating table doctor_master----#
#drop table Doctor_master;
create table Doctor_master(doctor_id varchar(15) primary key unique not null, doctor_name varchar(15) not null, Dept varchar(15) );
#--------inserting values in table Doctor_master------#
insert Doctor_master values('D0001','Ram','ENT');
insert Doctor_master values('D0002','Rajan','ENT');
insert Doctor_master values('D0003','Smita','Eye');
insert Doctor_master values('D0004','Bhavan','Surgery');
insert Doctor_master values('D0005','Sheela','Surgery');
insert Doctor_master values('D0006','Nethra','Surgery');

#select * from Doctor_master;

#-----------creating table room_master------#
#drop table ROOM_MASTER;
create table ROOM_MASTER(room_no varchar(15) primary key unique not null, room_type varchar(15) not null, status varchar(15) not null);
#-----------inserting table ROOM_MASTER---------#
insert ROOM_MASTER values('R0001','AC','occupied');
insert ROOM_MASTER values('R0002','Suite','vacant');
insert ROOM_MASTER values('R0003','NonAC','vacant');
insert ROOM_MASTER values('R0004','NonAC','occupied');
insert ROOM_MASTER values('R0005','AC','vacant');
insert ROOM_MASTER values('R0006','AC','occupied');

#-----------creating table patient_master---------#
create table PATIENT_MASTER(pid_name varchar(15) primary key unique not null, name varchar(15) not null, age int(15) not null, weight int(15) not null, gender varchar(10) not null, address varchar(50) not null, phoneno varchar(10) not null, disease varchar(50) not null, doctor_id varchar(10), foreign key(doctor_id) references DOCTOR_MASTER(doctor_id) on delete set null);
insert PATIENT_MASTER values('P0001','Gita',35, 65,'F','Chennai','9867145678','Eye Infection','D0003');
insert PATIENT_MASTER values('P0002','Ashish',40, 70,'M','Delhi','9845675678','Asthma','D0003');
insert PATIENT_MASTER values('P0003','Radha',25, 60,'F','Chennai','9867166678','Pain in heart','D0005');
insert PATIENT_MASTER values('P0004','Chandra',28, 55,'F','Bangalore','9978675567','Asthma','D0001');
insert PATIENT_MASTER values('P0005','Goyal',42, 65,'M','Delhi','8967533223','Pain in Stomach','D0004');


 
