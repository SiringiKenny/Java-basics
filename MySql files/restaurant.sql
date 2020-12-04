 -- restaurant 
    -- id, name, gstn
-- dish 
   -- id, name, price, calories
-- category
-- customers
   -- custid, name
-- order 
   -- order id, price, custid
-- order-line-items  
   -- dish id, qty, order id
drop database restaurant123;
create database restaurant123;
use restaurant123;
   
create table restaurant (
  id int unsigned primary key auto_increment,
  name varchar(40) not null,
  gst varchar(40) not null unique 
);  

 

create table customer (
   id bigint unsigned primary key auto_increment,
   name varchar(40) not null, 
   email_address varchar(40) not null unique
);

create table dish (
  id int unsigned primary key auto_increment,
  name varchar(40) not null unique,
  calories double not null,
  price double not null
);

create table orders(
  id bigint unsigned not null primary key auto_increment,
  total_price double not null, 
  order_date datetime default now(),
  cust_id bigint unsigned not null,
  constraint foreign key(cust_id) references customer(id)
);

create table order_line_item (
  id int unsigned not null primary key auto_increment,
  dish_id int unsigned not null,
  qty int unsigned not null,
  total_price double not null,
  order_id bigint unsigned not null,
  constraint foreign key(dish_id) references dish(id),
  constraint foreign key(order_id) references orders(id)
);

create table category (
   id int unsigned not null primary key,
   name varchar(20) not null unique
);

create table restaurants_customers (
   rest_id int unsigned,
   cust_id bigint unsigned,
   constraint primary key(rest_id, cust_id),
   constraint foreign key(rest_id) references restaurant(id),
   constraint foreign key(cust_id) references customer(id)
);
