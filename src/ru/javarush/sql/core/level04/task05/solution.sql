-- Рассчитываем общую сумму всех заказов из таблицы orders
SELECT order_id, SUM(order_amount) as total_order_amount
from orders