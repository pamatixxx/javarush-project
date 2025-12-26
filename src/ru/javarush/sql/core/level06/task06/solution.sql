-- Используем LEFT JOIN для объединения таблиц products и sales
-- LEFT JOIN гарантирует, что все строки из таблицы products будут включены в результат,
-- даже если для них нет соответствующих записей в таблице sales.

select products.product_name, SUM(sales.quantity) as total_sold
from products LEFT JOIN sales
on products.product_id = sales.product_id
group by products.product_id