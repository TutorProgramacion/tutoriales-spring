CREATE TABLE Customer(
    ID INTEGER PRIMARY KEY, 
    FirstName VARCHAR(20),
    LastName VARCHAR(30), 
    Street VARCHAR(50), 
    City VARCHAR(25));

CREATE TABLE Product(
    ID INTEGER PRIMARY KEY, 
    Name VARCHAR(30), 
    Price DECIMAL);