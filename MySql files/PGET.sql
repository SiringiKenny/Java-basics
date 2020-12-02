
#drop table emp;
#create table dept(did integer primary key, dname varchar(20),loc varchar(20));insert into dept values(10,'HR','MUM');insert into dept values(20,'IT','MUM');insert into dept values(30,'ACCOUNTS','PUNE');insert into dept values(40,'FINANCE','CHN');insert into dept values(50,'ADMIN','CHN');select * from dept;create table emp(id int primary key,ename varchar(20),did int,foreign key(did) references dept(did) on delete cascade);
#create table emp(id int primary key,ename varchar(20),did int,foreign key(did) references dept(did) on delete set null);
#insert into emp values(101,'Sam',30);insert into emp values(102,'Babu',30);insert into emp values(103,'Leela',40);insert into emp values(104,'Gayu',40);insert into emp values(105,'Anitha',90);select * from emp;
delete from dept where did=30;drop table emp;

