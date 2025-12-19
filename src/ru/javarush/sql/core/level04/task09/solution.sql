-- Используем агрегатные функции MIN() и MAX() для нахождения минимального и максимального количества товаров
select min(quantity) as min_quantity,max(quantity) as max_quantity
from products