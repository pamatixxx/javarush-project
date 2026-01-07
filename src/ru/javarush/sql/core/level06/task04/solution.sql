-- Используем INNER JOIN для объединения таблиц customers и orders по customer_id
select orders.order_id, customers.name, orders.amount
from customers INNER JOIN orders
on customers.customer_id = orders.customer_id