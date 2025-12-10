-- Выбор названия и цены товаров из категории "Appliances", отсортированных по цене по убыванию
select product_name, price
from products
where category ='Appliances'
order by price DESC