CREATE TABLE Salespeople (
    SalespersonID INT PRIMARY KEY,
    Name VARCHAR(100),
    City VARCHAR(100),
    Commission DECIMAL(5, 2)
);
SELECT Name, City
FROM Salespeople
WHERE City = 'London' AND Commission > 0.10;
