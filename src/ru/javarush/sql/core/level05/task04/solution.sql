-- Запрос для фильтрации продуктов, у которых указаны как количество, так и поставщик
select *
from products
where quantity is not null and supplier is not null