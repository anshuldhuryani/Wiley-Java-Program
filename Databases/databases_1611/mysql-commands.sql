
-- To get the list of databases:

	SHOW DATABASES;
	
-- To create new database:

	CREATE DATABASE sampledb;
	
-- To use database to implement database operations:

	USE sampledb;
	
-- To check which database is currently in use:

	SELECT database()
	SELECT database() from dual;
	
-- To get the status

	status
	
-- To drop database if not required:

	DROP DATABASE sampledb;
	
-- To check list of tables in used database:

	SHOW TABLES;
	
-- CREATE DATABASE TABLE named as `Department`(DDL Command)	

	CREATE TABLE departments
	(deptId int,
	deptName varchar(200),
	deptLocation varchar(200),
	deptAddedDate datetime);
	
-- Insert sample data into `departments` table: (DML Command)

	insert into departments values(10, 'Sales', 'Mumbai', SYSDATE());
	insert into departments values(20, 'Development', 'Chennai', '2022-10-01');
	insert into departments values(30, 'Testing', 'Chennai', CURRENT_DATE());
	
	insert into departments values(40, 'Deployment', NULL, CURRENT_DATE());
	insert into departments(deptId, deptName, deptAddedDate) values(50, 'Administration', CURRENT_DATE());
	insert into departments(deptName, deptId, deptAddedDate) values('Marketing', 60 , CURRENT_DATE());

-- INSERT MULTIPLE ROWS IN A TABLE 

	insert into departments VALUES
		(70, 'Sample Department 1', 'Hyderabad', SYSDATE()),
		(80, 'Sample Department 2', 'Hyderabad', SYSDATE()),
		(90, 'Sample Department 3', 'Hyderabad', SYSDATE())
	

	CREATE TABLE depts (id int, name varchar(20));
	
-- INSERT INTO SELECT (Copy data from one table to another)

	INSERT INTO depts(id, name)
	SELECT deptId, deptName from departments
	WHERE deptLocation = 'Mumbai';
	
-- Update Existing Data: To Update specific Records:
	
	UPDATE departments
	SET deptLocation = 'Telengana'
	WHERE deptId >= 70;
		
-- Update Existing Data: To Update all Records:
	
	UPDATE departments
	SET deptAddedDate = '2022-01-01',
		deptLocation = 'Delhi';

-- Delete Existing Data: To Delete specific Records:

	DELETE FROM departments
	WHERE deptId >= 70;

-- Delete Existing Data: To Delete all Records:

	DELETE FROM departments;

-------------------------------------------------------------	

	SHOW VARIABLES LIKE 'port';
	SHOW VARIABLES LIKE 'max_allowed_packet';
	SET GLOBAL max_allowed_packet = size;

-------------------------------------------------------------

/** Note: Drop the `departments` if its already created. **/

-- Create `departments` table with constraints

	CREATE TABLE departments
	(deptId int primary key,
	deptName varchar(200) not null,
	deptLocation varchar(200) check (deptLocation IN ('Mumbai', 'Hyderabad', 'Chennai')),
	deptAddedDate datetime);	

-- Inserting Sample Data into `departments` 

	insert into departments values(10, 'Sales', 'Mumbai', SYSDATE());
	insert into departments values(20, 'Development', 'Chennai', '2022-10-01');
	insert into departments values(30, 'Testing', 'Chennai', CURRENT_DATE());
	insert into departments values(40, 'Marketing', 'Hyderabad', CURRENT_DATE());
	insert into departments values(50, 'Administration', 'Chennai', '2021-10-01');
	insert into departments values(60, 'Advertisment', 'Hyderabad', '2021-05-25');

-- Create `employees` table with constraints

	CREATE TABLE employees
	(empId int PRIMARY KEY,
	empName varchar(200) NOT NULL,
	empSalary float CHECK (empSalary >= 5000),
	empEmail varchar(200) NOT NULL UNIQUE,
	managerId int REFERENCES empId,
	empAddedDate datetime DEFAULT CURRENT_TIMESTAMP,
	deptId int REFERENCES departments(deptId));
	
-- Insert Sample Data into 'employees' table:

	insert into employees VALUES(101, 'King', 10000, 'king@gmail', NULL, DEFAULT, 10);
	insert into employees VALUES(102, 'Kochhar', 12000, 'kochar@gmail', NULL, DEFAULT, 20);
	insert into employees VALUES(103, 'Smith', 30000, 'smith@gmail', NULL, DEFAULT, 20);
	insert into employees VALUES(104, 'Sarah', 34000, 'sarah@gmail', NULL, DEFAULT, 10);
	insert into employees VALUES(105, 'John', 21000, 'john@gmail', NULL, DEFAULT, 10);
	insert into employees VALUES(106, 'Roger', 6000, 'roger@gmail', NULL, DEFAULT, 40);
	insert into employees VALUES(107, 'Bond', 8000, 'bond@gmail', NULL, DEFAULT, 10);
	insert into employees VALUES(108, 'Ruskin', 10000, 'ruskin@gmail', NULL, DEFAULT, 40);
	insert into employees VALUES(109, 'Joseph', 40000, 'joseph@gmail', NULL, DEFAULT, 40);
	insert into employees VALUES(110, 'Sneh', 35000, 'sneh@gmail', NULL, DEFAULT, 10);
	insert into employees VALUES(111, 'Christin', 7800, 'christin@gmail', NULL, DEFAULT, 30);
	insert into employees VALUES(112, 'Chetan', 32000, 'chetan@gmail', NULL, DEFAULT, 30);
	insert into employees VALUES(113, 'Sujatha', 21000, 'sujatha@gmail', NULL, DEFAULT, NULL);
	insert into employees VALUES(114, 'Kaashvi', 41000, 'kaashvi@gmail', NULL, DEFAULT, NULL);
	
--------------------------------------------------------------------------------------

	SELECT * FROM employees;
	
	-- Considering, King(101) doesn't report to anyone.
	
	UPDATE employees
	SET managerId = NULL
	WHERE empId = 101;
	
	-- Considering, 
	
	UPDATE employees
	SET managerId = 101
	WHERE deptId = 10 AND NOT empId = 101;
	
	UPDATE employees
	SET managerId = 101
	WHERE empId = 102;
	
	UPDATE employees
	SET managerId = 102
	WHERE deptId = 20 AND NOT empId = 102;
	
	UPDATE employees
	SET managerId = 101
	WHERE empId IN (113,114);
	
	UPDATE employees
	SET managerId = 101
	WHERE empId = 106;
	
	UPDATE employees
	SET managerId = 106
	WHERE deptId IN (30, 40) AND NOT empId = 106;;
	
	
	
	
--------------------------------------------------------------------------------------

/* SELECT Statement: */

-- To retrieve all the records:

	SELECT * FROM departments;
	SELECT * FROM employees;

-- Projection - To Restrict the Columns: 

	SELECT empId, empName, empSalary 
	FROM employees;

-- Selection - To Restrict to Rows/Records:
	
	SELECT * 
	FROM employees 
	WHERE empSalary > 25000;
	
-- Projection and Selection - To retrict fields and records:

	SELECT empId, empName, empSalary 
	FROM employees
	WHERE empSalary > 25000;
	
-- Arithmetic Operators (Use these operators with select statement) (+, -, *, /)

	SELECT empId, empName, empSalary, empSalary / 30
	FROM employees
	WHERE empSalary > 25000;
	
-- To give Alias Names to the Column:

	SELECT empId, empName, empSalary, empSalary * 30 Annual_Salary
	FROM employees
	WHERE empSalary > 25000;
	
	SELECT empId, empName, empSalary, empSalary * 30 as Annual_Salary
	FROM employees
	WHERE empSalary > 25000;
	
	SELECT empId, empName, empSalary, empSalary * 30 "Annual Salary"
	FROM employees
	WHERE empSalary > 25000;
	
-- Error: Alias Names do not work with other clauses, 
-- you can use them with Select statement or order-by clause.
	
	SELECT empId, empName, empSalary, empSalary * 30 as Annual_Salary
	FROM employees
	WHERE Annual_Salary > 25000;
	
-- To use Conditional or Relational Operators: (>, <, >=, <=, =, <> or !=)	

	SELECT empId, empName, empSalary
	FROM employees
	WHERE empSalary > 25000 AND empSalary < 40000;
	
	SELECT empId, empName, empSalary
	FROM employees
	WHERE empSalary >= 25000 AND empSalary <= 40000;
	
	SELECT empId, empName, empSalary
	FROM employees
	WHERE empName != 'King';
	
	SELECT empId, empName, empSalary
	FROM employees
	WHERE empName <> 'King';
	
	SELECT empId, empName, empSalary, empAddedDate
	FROM employees
	WHERE empAddedDate = CAST('2022-16-11 12:57:40' AS DATETIME);
	
-- To use Logical Operators: (AND, OR, NOT)

	SELECT empId, empName, empSalary
	FROM employees
	WHERE empName = 'Smith' AND empSalary >= 30000;
	
	SELECT empId, empName, empSalary
	FROM employees
	WHERE empName = 'Smith' OR empName = 'Sarah' OR empName = 'Sujatha';
	
	SELECT empId, empName, empSalary
	FROM employees
	WHERE empName = 'Smith' AND NOT empSalary > 30000;
	
-- MISC Operators: (IN, BETWEEN, LIKE, IS NULL)

	SELECT empId, empName, empSalary
	FROM employees
	WHERE empName IN ('Smith', 'Sarah', 'Sujatha');
	
	SELECT empId, empName, empSalary
	FROM employees
	WHERE empName NOT IN ('Smith', 'Sarah', 'Sujatha');

-- To use between operator for range based queries:
	
	SELECT empId, empName, empSalary
	FROM employees
	WHERE empSalary BETWEEN 30000 AND 40000;
	
	SELECT empId, empName, empSalary
	FROM employees
	WHERE empSalary NOT BETWEEN 30000 AND 40000;
	
-- LIKE OPERATOR: To search data and retrieve
	
	-- (%) - Wildcard that matches any string of zero or more characters
	-- (_) - wildcard that matches any single character.

	SELECT empId, empName, empSalary 
	FROM employees
	WHERE empName LIKE 'K%'
	
	SELECT empId, empName, empSalary 
	FROM employees
	WHERE empName LIKE '%n';
	
	SELECT empId, empName, empSalary 
	FROM employees
	WHERE empName LIKE '%h%';
	
	SELECT empId, empName, empSalary 
	FROM employees
	WHERE empName LIKE '__a%';
	
-- To use IS NULL for null comparisons:

	SELECT * 
	FROM employees
	WHERE deptId = NULL; -- (Empty Set)
	
	SELECT * 
	FROM employees
	WHERE deptId = 'NULL'; -- (Empty set, 1 warning)
	
	SELECT * 
	FROM employees
	WHERE deptId IS NULL;
	
	SELECT * 
	FROM employees
	WHERE deptId IS NOT NULL;
	
-- To Limit the data being retrieved:

	-- To retrieve first five records:

	SELECT * FROM Employees
	LIMIT 5;
	
	-- To retrive 5 records after 10 records.

	SELECT * FROM Employees
	LIMIT 10, 5;
	
-- Order By clause to sort the data:

	SELECT * FROM employees
	ORDER BY empName;	-- Default: ASC ORDER
	
	SELECT * FROM employees
	ORDER BY empName ASC;	-- Default: ASC ORDER

	SELECT * FROM employees
	ORDER BY empName DESC;

	SELECT * FROM employees
	ORDER BY empName DESC, empSalary DESC;

	SELECT empId, empName, empSalary, empSalary * 30 Annual_Salary
	FROM employees
	WHERE empSalary > 25000
	ORDER BY Annual_Salary;
	
	SELECT empId, empName, empSalary, empSalary * 30 Annual_Salary
	FROM employees
	WHERE empSalary > 25000
	ORDER BY 2 DESC;
	
-------------------------------------------------------------

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
	
-------------------------------------------------------------------------------------------

/**

	Constraints: Restricts the data that needs to be inserted into relations or tables. They helps in making relationships between multiple relations or tables. There are five constraints:
	
	- Primary Key Constraint:
		- Doesn't allow duplicate values.
		- Doesn't allow null values.
		- Helps in referential integrity (Relationships)
		
	- Not Null Constraint
		- Doesn't allow null values.
	
	- Unique Constraint
		- Doesn't allow duplicate values.
		
	- Check Constraint
		- Helps in inserting the restricted data based upon conditions.
		
	- Foreign Key Constraint
	
	- Default (Constraint/Statement):
		- Helps in inserting the default values.
		
**/
	
--------------------------------------------------------------


	
	
	

	
	
	
	
	
	
	

	
	
	