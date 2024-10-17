
SELECT *
FROM Customers
WHERE NOT (Rating <= 100 AND City <> 'Rome');
