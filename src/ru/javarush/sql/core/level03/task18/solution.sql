-- Выбор уникальных записей из таблицы orders
-- Используем DISTINCT для удаления дубликатов
-- Преобразуем дату в формат DD.MM.YYYY с помощью TO_CHAR
-- Сортируем по order_date в порядке убывания

select DISTINCT TO_CHAR(order_date, 'DD.MM.YYYY') as formatted_order_date, customer_name, total_amount
from orders
ORDER BY formatted_order_date DESC