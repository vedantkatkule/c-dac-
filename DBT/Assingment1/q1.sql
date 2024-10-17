CREATE TABLE SALESPEOPLE (
    Snum INT(4),
    Sname VARCHAR(10),
    City VARCHAR(10),
    Comm FLOAT(3,2)
);

INSERT INTO SALESPEOPLE (Snum, Sname, City, Comm) VALUES
(1, 'Alice', 'NewYork', 0.10),
(2, 'Bob', 'LosAngeles', 0.15),
(3, 'Charlie', 'Chicago', 0.12);
CREATE TABLE CUSTOMERS (
    Cnum INT(4),
    Cname VARCHAR(10),
    City VARCHAR(10),
    Rating INT(4),
    Snum INT(4)
);

INSERT INTO CUSTOMERS (Cnum, Cname, City, Rating, Snum) VALUES
(101, 'John', 'NewYork', 5, 1),
(102, 'Doe', 'LosAngeles', 4, 2),
(103, 'Jane', 'Chicago', 3, 1);
CREATE TABLE ORDERS (
    Onum INT(4),
    Amt FLOAT(7,2),
    Odate DATE,
    Cnum INT(4),
    Snum INT(4)
);

INSERT INTO ORDERS (Onum, Amt, Odate, Cnum, Snum) VALUES
(1001, 250.75, '2023-01-15', 101, 1),
(1002, 300.50, '2023-01-16', 102, 2),
(1003, 150.00, '2023-01-17', 103, 1);

