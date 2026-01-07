-- Выбор названий и цен товаров, цена которых меньше 50
select product_name, price
where price < 50
from products