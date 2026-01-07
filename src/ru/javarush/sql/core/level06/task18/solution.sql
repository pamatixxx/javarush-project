-- Используем SELF JOIN для поиска пар товаров из одной категории
select p1.product_name as product_1, p2.product_name as product_2
from products p1 INNER JOIN products p2
on p1.category = p2.category
where p1.product_name != p2.product_name
AND p1.product_name < p2.product_name