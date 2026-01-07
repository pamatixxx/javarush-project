-- Выбираем строки из таблицы orders, где original_price не равен discounted_price
-- Используем функцию NULLIF(), чтобы исключить строки, где значения равны
select *
from orders
where nullif(original_price, discounted_price) is not null