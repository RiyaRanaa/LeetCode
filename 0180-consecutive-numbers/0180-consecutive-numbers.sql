# Write your MySQL query statement below
SELECT DISTINCT 
logs1.num AS ConsecutiveNums
FROM LOGS logs1
JOIN LOGS logs2 ON logs1.num = logs2.num AND logs1.id =logs2.id - 1
JOIN LOGS logs3 ON logs1.num = logs3.num AND logs1.id =logs3.id - 2
