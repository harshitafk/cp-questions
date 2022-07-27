# Write your MySQL query statement below
Select sub.employee_id
FROM (SELECT e.employee_id,e.name,s.salary from Employees e LEFT JOIN SALARIES s ON e.employee_id=s.employee_id 
     UNION
     SELECT s.employee_id,e.name,s.salary from Employees e RIGHT JOIN SALARIES s ON e.employee_id=s.employee_id) AS sub
WHERE sub.name IS NULL OR sub.salary IS NULL
ORDER BY sub.employee_id