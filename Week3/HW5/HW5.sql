--SELECT  
--ANSII
SELECT ContactName Adi, CompanyName Sirketadi,City Sehir FROM Customers

SELECT * FROM Customers WHERE City = 'Berlin'

--Case Insensitive
SELECT * FROM Products WHERE CategoryID = 1 or CategoryID = 3

SELECT * FROM Products WHERE CategoryID = 1 and UnitPrice >= 10

SELECT * FROM Products ORDER BY CategoryID, ProductName

SELECT * FROM Products where CategoryID =1 ORDER BY UnitPrice asc --ascending --descending

SELECT count(*) Adet FROM Products  WHERE CategoryID = 2

SELECT categoryId, count(*) FROM Products WHERE UnitPrice>20 GROUP BY CategoryID HAVING count(*)<10

SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
FROM Products inner join Categories 
ON Products.CategoryID = Categories.CategoryID
WHERE Products.UnitPrice >10

--DTO Data Transformation Object
--Boşluklu isimlendirmeleri bir bütün tanıyabilmesi için köşeli parantez koyulmalıdır.
SELECT *FROM Products P left join [Order Details] Od 
ON p.ProductID = Od.ProductID  

SELECT *FROM Products P left join [Order Details] Od 
ON p.ProductID = Od.ProductID 
inner join Orders O
ON O.OrderID = Od.OrderID

SELECT *FROM Customers C left join Orders O
ON C.CustomerID = O.CustomerID
WHERE O.CustomerID is null


