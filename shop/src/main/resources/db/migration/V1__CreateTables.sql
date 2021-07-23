create table ProductCategory_t (
    ID int not null auto_increment primary key,
    name varchar(100),
    description varchar(100)
);

create table Supplier_t (
    ID int not null auto_increment primary key,
    name varchar(100) not null
);

create table Product_t (
    ID int not null auto_increment primary key,
    name varchar(100) not null,
    description varchar(100);
    price decimal(19,2);
    weight double,
    category int,
    supplier int,
    image_url varchar(100)
);

create table if not exists Location_t(
    ID  int not null auto_increment primary key,
    name varchar(100) not null,
    addressCountry varchar(100) not null,
    addressCity varchar(100) not null,
    addressCounty varchar(100) not null,
    addressStreetAddress varchar(100) not null
);

create table Stock_t (
    ID  int not null auto_increment primary key,
    product int,
    location int,
    quantity int
);

create table if not exists Customer_t(
    ID int not null auto_increment primary key,
    firstName varchar(100) not null,
    lastName varchar(100) not null,
    username varchar(100) not null,
    password varchar(100) not null,
    emailAddress varchar(100) not null
);

create table if not exists Order_t (
    ID int not null auto_increment primary key,
    shippedFrom int,
    customer int NOT NULL,
    createdAt timestamp,
    addressCountry varchar(100),
    addressCity varchar(100),
    addressCounty varchar(100),
    addressStreetAddress varchar(100)
);

create table OrderDetail_t (
    ID  int not null auto_increment primary key,
    orderName int,
    product int,
    quantity int
);

create table Revenue_t (
    ID int not null auto_increment primary key,
    location int,
    data date,
    suma decimal(19,2)
);