CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerName VARCHAR(100),
    OrderAmount DECIMAL(10, 2),
    OrderDate DATE
);
SELECT *
FROM Orders
WHERE OrderAmount > 1000;
