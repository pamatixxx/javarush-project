-- Вычисление новой цены со скидкой, фильтрация товаров со скидкой и сортировка по цене со скидкой
select product_name, price, discount_percent, price - (price * discount_percent / 100) as discounted_price
from products
WHERE discount_percent > 0
ORDER BY discounted_price ASC
