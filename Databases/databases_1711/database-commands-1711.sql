
/* Alter Table Commands: */

CREATE TABLE product
(productId int primary key,
year int not null,
brand varchar(200) not null);


-- Add New Column to a product table:

	ALTER TABLE product
	ADD category VARCHAR(200) NOT NULL;
	
	ALTER TABLE product
	ADD supplier VARCHAR(200) NOT NULL
	AFTER brand;
	
	ALTER TABLE product
	ADD category VARCHAR(200) NOT NULL,
	ADD supplier VARCHAR(200) NOT NULL
	
-- Modify Existing Column into table:
		
	ALTER TABLE product
	MODIFY category INT NOT NULL;
	
	INSERT INTO product(productId, year, brand, Supplier, Category)
	VALUES(101, 2022, 'B1', 'ABC', 11);
	INSERT INTO product(productId, year, brand, Supplier, Category)
	VALUES(102, 2022, 'B1', 'ABC', 11);
	
	ALTER TABLE product
	MODIFY category VARCHAR(200) NOT NULL;
	
	ALTER TABLE product
	MODIFY supplier VARCHAR(2) NOT NULL;
	
-- Rename Column name in existing table:

	ALTER TABLE product
	CHANGE COLUMN supplier supplierName VARCHAR(200) NOT NULL;
	
-- Drop Column from Existing Table:

	ALTER TABLE product
	DROP COLUMN supplierName;
	
-- Add New Column after Having certain data in existing table:

	ALTER TABLE product
	ADD productName VARCHAR(200) NOT NULL;
	
	ALTER TABLE product
	DROP COLUMN productName;
	
	ALTER TABLE product
	ADD productName VARCHAR(200) DEFAULT 'Sample Product';
	
-- Rename Existing Table:

	ALTER TABLE product
	RENAME TO productDetails;
		
/* -------------------------------------------------------- */

-- Inner Join: Fetching matched rows from multiple tables.

	SELECT empName, deptName
	FROM employees join departments
	ON employees.deptId = departments.deptId;
	
	SELECT employees.empName, departments.deptName
	FROM employees join departments
	ON employees.deptId = departments.deptId;
	
	SELECT e.empName, d.deptName
	FROM employees e inner join departments d
	ON e.deptId = d.deptId;
	
	SELECT *
	FROM employees e join departments d
	ON e.deptId = d.deptId;
	
	SELECT e.empName, d.deptName, d.*
	FROM employees e join departments d
	ON e.deptId = d.deptId;
	
-- Left Outer Join: Retrieves all matched records from left table and only matched records from right table. 

	SELECT e.empId, e.empName, d.deptId, d.deptName
	FROM employees e left outer join departments d
	ON e.deptId = d.deptId;

-- Right Outer Join: Retrieves all records from right table and only matched records from left table. 

	SELECT e.empId, e.empName, d.deptId, d.deptName
	FROM employees e right outer join departments d
	ON e.deptId = d.deptId;

-- Full Outer Join: Retrieves all records from right table and only matched records from left table. 

	SELECT e.empId, e.empName, d.deptId, d.deptName
	FROM employees e full outer join departments d
	ON e.deptId = d.deptId;
	
-- Self Join: Joining a table itself. (We use in the case of self-referencial integritt):

	SELECT emp.empName "Employee Name", mgr.empName "Manager Name"
	FROM employees emp JOIN employees mgr 
	ON emp.managerId = mgr.empId;
	
	SELECT emp.empName, emp.managerId, mgr.empName, mgr.empId
	FROM employees emp JOIN employees mgr 
	ON emp.managerId = mgr.empId;
	
-- Self Join:  Writea query to retrieve if we have any employee who doesn't have any manager in an organizartion along with all the employees who reportTo any other employee as an manager.
	
	SELECT emp.empName "Employee Name", mgr.empName "Manager Name"
	FROM employees emp LEFT OUTER JOIN employees mgr 
	ON emp.managerId = mgr.empId
	ORDER BY mgr.empName;
	
-- Match customers that are from same city and country:

	SELECT c1.FirstName F1, c1.LastName L1,
			c2.FirstName F2, c2.LastName L2
	FROM customer c1 JOIN customer c2 
	ON c1.Id <> c2.Id 
	AND c1.City = c2.City 
	AND c1.Country = c2.Country;
	
	
	SELECT c1.FirstName F1, c1.LastName L1,
			c2.FirstName F2, c2.LastName L2
	FROM customer c1 JOIN customer c2 
	ON c1.City = c2.City 
	AND c1.Country = c2.Country;
	
-- Cross Join: Cartisian Product
-- (Each Row of Left table gets multiplied by each row of right table)

	SELECT e.empName, d.deptName
	FROM employees e JOIN departments d;
	
-- When does this cross join applied ?
	-- When you omit JOIN condition
	-- WHen your join condition is not valid
	
-- Joining 3 Tables: 

-- Query: List all suppliers with products that have sold, Sorted by Supplier.

	SELECT CompanyName, ProductName
	FROM Supplier s 
	JOIN Product p ON s.Id = p.SupplierId
	LEFT JOIN OrderItem o ON p.Id = o.ProductId
	ORDER BY CompanyName;
	
-------------------------------------------------------------------------------

-- Functions are categorized in two types:	Single-Row Function, Multi-Row Function

-- Single Row Function:

	SELECT empName, UPPER(empName)
	FROM employees;

-- Aggregate Functions: (Multi-Row Functions/Group Functions)
-- Group Functions/Aggregate Function: COUNT, SUM, AVG, MIN, MAX

-- Count Function: Counts the records or values based upon parameter being passed.
-- Count Function: doesn't count null values.

	SELECT count(*) FROM employees;
	
	SELECT count(empId) FROM employees;
	
	SELECT count(managerId) FROM employees;
	
	SELECT count(distinct managerId) FROM employees;
	
-- SUM, AVG, MAX, MIN

	SELECT SUM(empSalary) FROM employees;
	SELECT AVG(empSalary) FROM employees;
	SELECT MAX(empSalary) FROM employees;
	SELECT MIN(empSalary) FROM employees;
	
	SELECT 
		SUM(empSalary) TotalSalary,
		AVG(empSalary) AverageSalary,
		AVG(empSalary) MaximumSalary,
		AVG(empSalary) MinimumSalary	
	FROM employees;

-- Write a query to find the sum of salary given to each department.

	SELECT deptId, SUM(empSalary)
	FROM employees
	GROUP BY deptId;
	
-- Output: Not Exepected as empName is not grouped.
	
	SELECT deptId, empName, SUM(empSalary)
	FROM employees
	GROUP BY deptId, empName;
	
-- Note: A column that we would like to use with aggregate function must be grouped.

	SELECT deptId, managerId, SUM(empSalary)
	FROM employees
	GROUP BY deptId, managerId
	ORDER BY deptId;
	
-- HAVING Clause: Conditional Clause used with aggregate columns.

	SELECT deptId, SUM(empSalary)
	FROM employees
	WHERE deptId IS NOT NULL
	GROUP BY deptId;
	
	SELECT deptId, SUM(empSalary) TotalSalary
	FROM employees
	WHERE deptId IS NOT NULL
	GROUP BY deptId
	HAVING SUM(empSalary) > 40000;
	
-----------------------------------------------------------------

-- Find the largest Order placed in 2014.

	SELECT MAX(TotalAmount) 
	FROM `Order`
	WHERE YEAR(OrderDate) = 2014;
	
	SELECT MAX(TotalAmount) 
	FROM `Order`
	WHERE OrderDate like '%2014%';

-- Calculate the total Sales in 2013.

	SELECT SUM(TotalAmount) 
	FROM `Order`
	WHERE YEAR(OrderDate) = 2013;
	
	SELECT SUM(TotalAmount) 
	FROM `Order`
	WHERE OrderDate like '%2013%';

-- List the number of Customers in each Country.

	SELECT Country, Count(Id) As Customers
	FROM Customer
	GROUP BY Country;

-- List the number of products for each supplier, high to low.

	SELECT s.CompanyName, COUNT(p.Id) AS Products
	FROM Supplier s
	JOIN Product p ON s.Id = p.SupplierId
	GROUP BY s.CompanyName
	ORDER BY Count(p.Id) DESC
	

-----------------------------------------------------------------




	
	
	
	
	
	
