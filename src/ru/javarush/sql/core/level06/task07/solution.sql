-- Решение задачи: вывести все продажи с использованием RIGHT JOIN
-- RIGHT JOIN гарантирует, что будут сохранены все строки из таблицы sales (правой таблицы).

select sale_id, product_id, name, quantity
from products RIGHT JOIN sales
on products.product_id = sales.product_id