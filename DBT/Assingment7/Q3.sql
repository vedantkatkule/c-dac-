CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    OrderAmount DECIMAL(10, 2),
    OrderDate DATE
);
SELECT CustomerID, MIN(OrderAmount) AS SmallestOrder
FROM Orders
GROUP BY CustomerID;
