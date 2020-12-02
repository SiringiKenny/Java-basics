savepoint A;
select * from emp;
delete from emp where id >3;
insert into emp values(1,'Aparna',40);
insert into emp values(2,'Anu',50);
insert into emp values(3,'Naveen',40);
select * from emp;

savepoint B;
select * from emp;
insert into emp values(99,'Janaki',40);
insert into emp values(98,'Jagan',50);
insert into emp values(96,'Neela',40);
#select * from emp;

rollback to savepoint B;

