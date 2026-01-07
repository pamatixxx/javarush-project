-- Запрос для получения всех товаров, начиная с третьего по порядку
-- Указываем порядок строк по product_id, чтобы определить последовательность

select product_id, name, price
from products
order by product_id
offset 2