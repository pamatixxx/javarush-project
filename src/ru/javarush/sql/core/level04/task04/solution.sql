-- Подсчёт количества продуктов, у которых указана цена (price не равна NULL)
select COUNT(price)
from products
where price IS NOT NULL