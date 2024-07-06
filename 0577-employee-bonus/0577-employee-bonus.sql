# Write your MySQL query statement below
SELECT a.name, b.bonus 
FROM Employee a LEFT JOIN
bonus b ON a.empId = b.empId
WHERE b.bonus < 1000 OR bonus IS NULL