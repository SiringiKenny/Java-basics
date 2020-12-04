show databases;
create database hexaware_db;
use hexaware_db;

 -- blog
     -- blog_id - primarykey
     -- url - varchar unique not null
     -- owner_name - varchar not null 
     -- email_address - varchar unique not null
     
    -- posts
      -- pid - int primary key
      -- title - varchar not null unique
      -- content - blob not null
      -- created_dt - datetime 
      -- blog_id - int foriegn key
      
    -- authors 
      -- auth_id - int primary key
      -- name - varchar - not null
      -- email_address - varchar not null unique 
      
    -- comments 
      -- comment_id - int  primary key
      -- comments - varchar not null
      -- post_id - int foreign key
      
    -- tag   
      -- tag_id - int  primary key
      -- tag_name - varchar not null unique

-- relationship between entities
-- Blog to Post - One to many
-- Post to comments - One to many
-- Post to Tags - Many to Many
-- Post to Authors - Many to Many 



create table blog (
   blog_id int unsigned primary key,
   blog_url varchar(40) not null unique,
   email_address varchar(40) not null unique
);

create table posts (
  post_id int unsigned primary key,
  title varchar(100) not null unique,
  content blob,
  blog_id int unsigned references blog(blog_id),
  created_dt datetime default now()
  -- constraint foreign key(blog_id) references blog(blog_id)
);

create table authors(
  author_id int unsigned primary key,
  name varchar(20) not null,
  email_address varchar(20) not null unique
);

create table posts_authors (
  post_id int unsigned,
  author_id int unsigned,
  constraint primary key (post_id, author_id),
  constraint foreign key(post_id) references posts(post_id),
  constraint foreign key(author_id) references authors(author_id)
);

create table comments (
   id int unsigned primary key,
   text blob not null,
   post_id int unsigned references posts(post_id)
);

create table tags(
   tag_id int unsigned primary key,
   tag_name varchar(40) not null unique
);

create table posts_tags(
   post_id int unsigned references posts(post_id),
   tag_id int unsigned references tags(tag_id),
   constraint primary key(post_id, tag_id)
);
