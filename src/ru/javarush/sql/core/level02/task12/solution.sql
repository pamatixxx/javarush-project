-- Запрос для вывода всех товаров из таблицы products,
-- отсортированных по цене в порядке убывания.

select product_id, product_name, price
from products
ORDER by price DESC