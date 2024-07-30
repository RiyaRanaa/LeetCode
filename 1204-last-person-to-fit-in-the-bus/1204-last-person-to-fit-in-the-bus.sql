# Write your MySQL query statement below
SELECT person_name FROM Queue
WHERE(
    SELECT SUM(weight) 
    FROM Queue q
    WHERE q.turn <= Queue.turn
) <= 1000
ORDER BY turn 
DESC
LIMIT 1;