# Write your MySQL query statement below
SELECT s.user_id,
ROUND(
    sum(CASE WHEN c.action='confirmed' then 1 else 0 end)/count(*)
    ,2
)as confirmation_rate
from signups s left join 
confirmations c on s.user_id=c.user_id
group by s.user_id