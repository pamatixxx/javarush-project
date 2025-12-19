-- Запрос для сортировки заказов по дате (по возрастанию) и идентификатору клиента (по убыванию)
select order_id, customer_id, order_date, total
from orders
ORDER BY order_date ASC, customer_id DESC