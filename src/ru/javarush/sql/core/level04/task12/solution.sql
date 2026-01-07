-- Группировка данных по категориям и подсчёт количества продуктов в каждой категории
select category, COUNT(*) as product_count
from products
group by category