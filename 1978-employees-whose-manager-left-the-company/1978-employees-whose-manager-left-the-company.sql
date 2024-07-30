# Write your MySQL query statement below
SELECT employee_id FROM Employees
WHERE salary < 30000
AND manager_id NOT IN(
    SELECT employee_id FROM Employees
)
ORDER BY employee_id;
-- SELECT e.employee_id FROM Employees e
-- LEFT JOIN Employees e2 ON e.manager_id = e2.employee_id
-- WHERE e.salary < 30000 
-- AND e2.employee_id IS NULL
-- AND e.manager_id IS NOT NULL
-- ORDER BY employee_id;

