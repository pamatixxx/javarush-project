-- Группировка клиентов по странам и подсчет общего количества заказов
select country,SUM(orders_count) as total_orders
from customers
GROUP BY country