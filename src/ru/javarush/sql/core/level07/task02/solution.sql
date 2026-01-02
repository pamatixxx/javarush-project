-- Используем LEFT JOIN для объединения таблиц orders и customers
-- Выбираем order_id и order_date из таблицы orders, а также name из таблицы customers

select orders.order_id, orders.order_date, customers.name
from orders LEFT JOIN customers
on orders.customer_id = customers.customer_id;