CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(100),
    City VARCHAR(100),
    Rating INT
);
SELECT City, MAX(Rating) AS HighestRating
FROM Customers
GROUP BY City;
