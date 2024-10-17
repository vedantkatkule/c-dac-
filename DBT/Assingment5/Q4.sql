SELECT * FROM Orders 
WHERE (amt < 1000 OR 
      NOT (odate = '1990-10-03' AND cnum > 2003));
