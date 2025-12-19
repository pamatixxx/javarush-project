-- Извлечение стоимости товаров из таблицы products и округление до ближайшего целого значения
select price as original_price, ROUND(price) as rounded_price
from products