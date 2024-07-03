# Write your MySQL query statement below
SELECT b.product_name, a.year,a.price FROM sales a left join product b on a.product_id=b.product_id;