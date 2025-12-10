-- Запрос к таблице products
SELECT product_name || '-' || category as "Описание", price
from products