# Write your MySQL query statement below
SELECT user_id, name, mail
FROM Users
WHERE mail LIKE '%@leetcode.com'
AND mail REGEXP '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode.com$';
