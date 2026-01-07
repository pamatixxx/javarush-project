-- Вывод категорий и средней цены, где цена не NULL и средняя цена больше 500
select category, avg(price) as avg_price
from items
where price is not null
group by category
HAVING  avg(price) > 500