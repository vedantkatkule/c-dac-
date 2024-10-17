-- Assuming the Supplier table has already been created and populated
-- If not, create the Supplier table and insert sample data

CREATE TABLE IF NOT EXISTS Supplier (
    SupplierID INT PRIMARY KEY,
    SupplierName VARCHAR(50),
    CITY VARCHAR(50),
    status INT
);

INSERT INTO Supplier (SupplierID, SupplierName, CITY, status) VALUES
(1, 'supplier a', 'New York', 15),
(2, 'supplier b', 'Los Angeles', 18),
(3, 'supplier c', 'Chicago', 12),
(4, 'supplier d', 'Houston', 20),
(5, 'supplier e', 'San Francisco', 10);

-- 1. Display all the Supplier names with the initial letter capital.
SELECT CONCAT(UPPER(LEFT(SupplierName, 1)), LOWER(SUBSTRING(SupplierName, 2))) AS CapitalizedSupplierName
FROM Supplier;

-- 2. Display all the Supplier names in upper case.
SELECT UPPER(SupplierName) AS UpperCaseSupplierName
FROM Supplier;

-- 3. Display all the Supplier names in lower case.
SELECT LOWER(SupplierName) AS LowerCaseSupplierName
FROM Supplier;

-- 4. Display all the Supplier names padded to 25 characters, with spaces on the left.
SELECT LPAD(SupplierName, 25) AS PaddedSupplierName
FROM Supplier;

-- 5. Display all the Supplier names (with ‘la’ replaced by ‘ro’).
SELECT REPLACE(SupplierName, 'la', 'ro') AS ReplacedSupplierName
FROM Supplier;

-- 6. Implement the above command such that ‘l’ is replaced with ‘r’ and ‘a’ is replaced with ‘o’.
SELECT REPLACE(REPLACE(SupplierName, 'l', 'r'), 'a', 'o') AS MultiReplacedSupplierName
FROM Supplier;

-- 7. Display the Supplier names and the lengths of the names.
SELECT SupplierName, LENGTH(SupplierName) AS NameLength
FROM Supplier;

-- 8. Use the soundex function to search for a supplier by the name of ‘BLOKE’.
SELECT *
FROM Supplier
WHERE SOUNDEX(SupplierName) = SOUNDEX('BLOKE');

-- 9. Display the Supplier name and the status (as Ten, Twenty, Thirty, etc.).
SELECT SupplierName,
       CASE 
           WHEN status = 10 THEN 'Ten'
           WHEN status = 20 THEN 'Twenty'
           WHEN status = 30 THEN 'Thirty'
           ELSE 'Other' 
       END AS StatusDescription
FROM Supplier;

-- 10. Display the current day (e.g., Thursday).
SELECT DAYNAME(CURRENT_DATE) AS CurrentDay;
