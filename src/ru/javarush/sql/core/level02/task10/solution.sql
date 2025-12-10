-- Выбор товаров, которые относятся к категории "Электроника" или имеют цену меньше 100
select name, category, price
from products
where category = 'Электроника' OR price < 100