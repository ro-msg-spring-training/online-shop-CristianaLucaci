create table ProductCategory (
    ID int not null auto_increment primary key,
    name varchar(100),
    description varchar(100)
);

create table Supplier (
    ID int not null auto_increment primary key,
    name varchar(100) not null
);

create table Product (
    ID int not null auto_increment primary key,
    name varchar(100) not null,
    description varchar(100);
    price decimal(19,2);
    weight double,
    category int,
    supplier int,
    image_url varchar(100)
);

create table if not exists Location(
    ID  int not null auto_increment primary key,
    name varchar(100) not null,
    address_country varchar(100) not null,
    address_city varchar(100) not null,
    address_county varchar(100) not null,
    street_address varchar(100) not null
);

create table Stock (
    ID  int not null auto_increment primary key,
    product int,
    location int,
    quantity int
);

create table if not exists Customer(
    ID int not null auto_increment primary key,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    username varchar(100) not null,
    password varchar(100) not null,
    email_address varchar(100) not null
);

create table if not exists Order_t (
    ID int not null auto_increment primary key,
    shipped_from int,
    customer int NOT NULL,
    created_at timestamp,
    address_country varchar(100),
    address_city varchar(100),
    address_county varchar(100),
    street_address varchar(100)
);

create table OrderDetail (
    ID  int not null auto_increment primary key,
    order_name int,
    product int,
    quantity int
);

create table Revenue (
    ID int not null auto_increment primary key,
    location int,
    data date,
    suma decimal(19,2)
);