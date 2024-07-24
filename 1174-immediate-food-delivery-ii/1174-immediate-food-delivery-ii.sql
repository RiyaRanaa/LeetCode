# Write your MySQL query statement below
SELECT 
ROUND(SUM(first_order_is_immediate)/COUNT(*)*100,2)AS immediate_percentage
FROM (
    SELECT customer_id,
    MIN(order_date)AS first_order_date,
    MIN(customer_pref_delivery_date)AS first_pref_delivery_date,
    CASE When MIN(order_date)=MIN(customer_pref_delivery_date) THEN 1 ELSE 0 END AS first_order_is_immediate
    FROM Delivery
    GROUP BY customer_id
)
AS first_orders;