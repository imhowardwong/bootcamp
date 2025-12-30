-- MySQL Workbase (Client Side)

use sys; -- Login database sys
create database bootcamp_2510p;
use bootcamp_2510p; -- login another database
-- one database have many tables
-- Harddisk
create table persons (
	id int, 
    first_name varchar(50),
    last_name varchar(50),
    age int,
    department varchar(2)
);

-- * mean all columns
select * from persons;

-- 2-3 ways
insert into persons (id, first_name, last_name, age, department) values (1, 'John','Lau',30,'IT');
insert into persons (id, first_name, last_name, age, department) values (2, 'Leo','Wong',48,'HR');
insert into persons (id, first_name, last_name, age, department) values (3, 'Jenny','Lau',50,'MK');
insert into persons (id, first_name, last_name, age, department) values (4, 'Oscar','Chan',30,'IT');
select first_name, age from persons;

-- where (select some rows in condition)
-- select * from persons where age>35;
-- delete from persons;

-- AND OR
select * from persons where last_name = 'Lau' and department = 'IT';
select * from persons where last_name = 'Lau' or department = 'IT';
select * from persons where last_name = 'Lau' and department = 'IT' or age >47;
select * from persons where (age > 47 or last_name = 'Lau') and department = 'IT';
select * from persons where department <> 'IT'; -- not equal
select * from persons where age >=48; 
select * from persons where first_name = 'JENNY'; -- data -> case insenitive

-- static
select concat(first_name, ' ', last_name) as full_name from persons;
select concat(p.first_name, ' ', p.last_name) as full_name, p.* from persons p;

-- without column names, you have to place the value in correct sequence
insert into persons values (5, 'Keith','Chan',37,'MK');
insert into persons values 
	(6, 'Kelly','Lau',38,'IT'),
    (7, 'Steve','Cheung',20,'IT');
    
select * from persons;

-- orders
-- id, order_no, amount, tran_date
create table orders(
	id int,
    order_no varchar(20),
    amount decimal(8,2),
    tran_date date
);

-- drop table orders;
insert into orders values (1, 'M202512180001', 99.99, '2025-01-31');
insert into orders values (2, 'M202512180002', 1999.5, '2024-02-28');
insert into orders values (3, 'M202512180003', 2000, '2024-01-30');

select * from orders;
-- Java : boolean, Database varchar : Y/N

-- update
select * from orders;
update orders set amount = amount * 0.9 where order_no = 'M202512180002';

select * from persons;
update persons set department = 'IT' where first_name = 'Jenny' and last_name = 'Lau'; 

-- update 2 fields in one statement
update persons set department = 'HR', age = 55 where first_name = 'Kelly' and last_name = 'Lau'; 
select * from persons;

-- add column in a table (All null values after adding a new column)
-- Java Double(Wrapper class allow Null)
alter table persons add salary decimal (8,2);
select * from persons;

update persons set salary = 25000 where first_name = 'Jenny' and last_name = 'Lau';
update persons set salary = 18000 where first_name = 'Oscar' and last_name = 'Chan';
update persons set salary = 37000 where first_name = 'Kelly' and last_name = 'Lau';
select * from persons;

-- delete from (delete all data) / drop table (Remove table structure)


-- Group By + Having

-- Aggregation Function
-- min/max/count/average/sum (SD, Median)

-- Many data -> Single Data
-- Data (Row)
select salary from persons where first_name = 'Oscar' and last_name = 'Chan';
select sum(salary) from persons where last_name = 'Lau';
select * from persons;

-- select (show which columns)
-- where (filter rows)
-- group by (grouping)

-- group by department -> select department -> Agg fuction
-- count(salary)
select department, sum(salary), max(salary), min(salary), count(*), avg(salary) from persons group by department;
select department, sum(salary)/count(*) from persons group by department;
select department, max(salary) + min(salary) from persons group by department;
select department, max(salary) + min(age) from persons group by department;
select department, avg(salary) from persons group by department;
-- Round
select department, round(sum(salary)/count(*),2) from persons group by department;

-- where + group (out someone then group)
select department, sum(salary) from persons group by department;
select department, sum(salary) from persons where age >= 30 group by department;

-- group by likely -> aggregation function
select genre, sum(price)/ count(*) from books group by genre; 

select id, first_name, salary, department, 'hello', 1 from persons;
select department, count('hello'), count(1), count(*) from persons group by department;

-- select (read)
-- update, insert, delete (write)
select concat(first_name, 'hello') from persons;

-- where -> group by (filter rows) + having (filter group), (must be true, false)
select department, sum(salary) as total_salary
from persons
where age >= 30
group by department
having count(1) >2; -- HR count(1) = 2

select * from persons;
-- department max(salary) >= 30000, select count(1)
select department, count(*) as number_of_persons
from persons
group by department having max(salary) >= 30000;

-- step 1 : where
-- step 2 : group by + having (filter group)
-- step 3 : select

select max(total_salary) 
from
(select department, sum(salary) as total_salary
from persons
group by department having max(salary)>20000) as result;


select * from persons;

-- ONE TO MANY EXAMPLE
create table departments (
	id integer primary key, -- unique, not null
    dep_name varchar(30)
);
select * from departments;

create table employees (
	id integer primary key,
    emp_name varchar(30),
	join_date date,
    dep_id integer not null, -- 
    foreign key (dep_id) references departments(id) -- ensure employees.dep_id exists in departments
);
select * from employees;

insert into departments values (1, 'IT');
insert into departments values (2, 'MK');

insert into employees values (1, 'John', '2025-10-01', 1);
-- insert into employees values (2, 'Leo', '2025-01-01', 100);
insert into employees values (2, 'Leo', '2025-01-01', 2);

drop table employees;
drop table departments;

-- MANY TO MANY EXAMPLE
-- Students vs Courses

create table students (
	id integer primary key,
    stu_name varchar(30) not null
);

create table courses (
	id integer primary key,
    course_name varchar(30) not null
);

create table student_courses (
	id integer primary key,
	reg_date date not null,
    stu_id integer not null,
    course_id integer not null,
    foreign key (stu_id) references students(id),
    foreign key (course_id) references courses(id)
);
-- PK, FK
insert into students values (1, 'Leo');
insert into students values (2, 'Jenny');

insert into courses values (1, 'MATH');
insert into courses values (2, 'ENGLISH');
insert into courses values (3, 'CHINESE');

insert into student_courses values (1, '2025-08-25', 1, 2); -- Leo English
insert into student_courses values (2, '2025-08-25', 1, 3); -- Leo Chinese

insert into student_courses values (3, '2025-08-30', 2, 2); -- Jenny English
insert into student_courses values (4, '2025-08-15', 2, 1); -- Jenny Math

select * from student_courses;

-- INNER JOIN (SQL)
select * from departments;
select * from employees;

-- Inner join (table data x table data) on condition (filter)
select e.id as emp_id,
d.id as dep_id,
e.emp_name,
d.dep_name,
e.join_date
from departments d inner join employees e on e.dep_id = d.id; 

-- Students courses
-- inner join 
select s.id, s.stu_name, c.course_name, r.reg_date
from student_courses r 
	inner join students s on r.stu_id = s.id
    inner join courses c on r.course_id = c.id;

select * from student_courses;

select * from students;

-- Database
-- One-to-One
-- Table A 3 columns (heavy read) (Username, Password)
-- Table B 4 columns (read-write) (Profile picutre)

-- Table C 7 columns (Username, Password, Profile picture)

select concat(first_name, ' ', last_name)
 from persons;

select substring(first_name, 1,4)  from persons;

select length(first_Name), length(last_name), Upper(first_name), Lower(Last_name)
 from persons;
 
 select replace(first_name, 'J', 'X') 
 from persons;
 
 insert into persons values (8, '大明', '陳', 26, 'MK', 28000);
 select char_length(first_name), length(first_name), p.* from persons p;
 
 select instr(first_name, 'J'), p.* from persons p;

select p.*, (select max(salary) from persons)
from persons p;

select * from persons;
-- fidn the first name and last name of the persons who has max salary
-- subquery approach 1
select * from persons
where salary = (select max(salary) from persons);
-- subquery approach 2
select *
from persons p1 inner join (select max(salary) as max_salary from persons) p2 on p1.salary = p2.max_salary;

-- CTE
with max_salary_table as (
	select max(salary) from persons
    )
select p.*, m.*
from persons p inner join max_salary_table m on p.salary = m.max_salary;

-- Exists
select * from departments;
select * from employees;
insert into departments values(3,'HR');
-- find the departments which has employee
select d.*, e.*
from departments d inner join employees e on e.dep_id = d.id;

select d.*
from departments d 
where exists (select 1 from employees e where d.id = e.dep_id);

-- find the departments which is no employee
select d.*, e.*
from departments d left join employees e on e.dep_id = d.id
where e.dep_id is null;

-- Order by
select * 
from persons
order by salary desc
limit 2;
-- descending order
select *
from persons
order by salary;
-- ascending order

-- create new database
CREATE DATABASE BOOTCAMP_EXERCISE1;
-- get into database
USE BOOTCAMP_EXERCISE1;

create table regions (
	region_id integer primary key,
    region_name varchar(25) not null
);

create table countries (
	country_id integer primary key,
    country_name varchar(20) not null,
    foreign key (region_id) references regions(id)
);

create table locations (
	location_id integer primary key,
	street_address varchar(25) not null,
    postal_code varchar(12) not null,
    city varchar(30) not null,
    state_province varchar(12) not null,
    foreign key (country_id) references countries(id)
);
create table departments (
	department_id integer primary key,
	department_name varchar(30) not null,
    manager_id integer not null,
    foreign key (location_id) references locations(id)
);
create table employees (
	employee_id integer primary key,
	first_name varchar(20) not null,
    last_name varchar(25) not null,
    email varchar (25) not null,
    phone_number varchar (20),
    hire_date date not null,
    job_id varchar(10) not null,
    salary integer not null,
    commission_pct integer not null,
    manager_id integer not null,
    foreign key (department_id) references departments(id)
);
create table job_history (
	employee_id integer primary key,
    start_date date primary key,
	end_date date not null,
    job_id varchar(10) not null,
    foreign key (department_id) references deaprtments(id)
);
create table jobs (
	job_id varchar(10) primary key,
	job_title varchar(35) not null,
    min_salary integer not null,
    max_salary integer not null
    );
create table job_grades (
	grade_level varchar(2) primary key,
    lowest_sal integer not null,
    highest_sal integer not null
    );