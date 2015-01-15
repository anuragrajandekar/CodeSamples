
-- Creating Customer Table
create table customer (
ID int,
cust_name varchar(50) 
)

-- Creating Seller Table
create table seller (
ID int,
sell_name varchar(50) 
)

-- Selecting Customer and Seller Table
select * from customer
select * from seller

-- Inserting into Customer table
insert into customer (ID, cust_name)
values (1, 'John')

insert into customer (ID, cust_name)
values (2, 'Shell')

insert into customer (ID, cust_name)
values (3, 'Push')

insert into customer (ID, cust_name)
values (4, 'Cole')

-- Inserting into Seller table
insert into seller (ID, sell_name)
values (1, 'XXX')

insert into seller (ID, sell_name)
values (2, 'John')

insert into seller (ID, sell_name)
values (3, 'YYY')

insert into seller (ID, sell_name)
values (4, 'Cole')


-- Inner join
select * from customer
INNER JOIN seller
on customer.cust_name = seller.sell_name

-- Left Outer Join
select * from customer
LEFT OUTER JOIN seller
on customer.cust_name = seller.sell_name

-- Right Outer Join
select * from customer
RIGHT OUTER JOIN seller
on customer.cust_name = seller.sell_name

-- Full Outer Join
select * from customer
FULL OUTER JOIN seller
on customer.cust_name = seller.sell_name
