# Write your MySQL query statement below
SELECT e.name as Employee 
FROM Employee as e
WHERE salary > (SELECT salary from Employee as f WHERE e.managerId = f.id);