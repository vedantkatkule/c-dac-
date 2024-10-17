

CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    SalespersonID INT,
    OrderDate DATE,
    OrderAmount DECIMAL(10, 2)
);


SELECT OrderDate, COUNT(DISTINCT SalespersonID) AS UniqueSalespersonCount
FROM Orders
GROUP BY OrderDate
ORDER BY OrderDate;
