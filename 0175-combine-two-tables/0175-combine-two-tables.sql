# Write your MySQL query statement below
select p.firstName AS firstName, p.lastName AS lastName, a.city as city, a.state AS state
from Person As p
left outer join Address as a
ON p.personId = a.personId
Group By p.firstName, p.lastName, a.city, a.state;
