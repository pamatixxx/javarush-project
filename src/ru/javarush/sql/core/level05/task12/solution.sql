-- Запрос для выбора цены и вычисления категории price_category
-- Используется конструкция CASE WHEN ... THEN ... ELSE ... END
select price,
case
    when price is null then 'Unknown'
    when price < 20 then 'Low'
    when price >= 20 and price <= 100 then 'Medium'
    when price > 100 then 'High'

end as price_category
from products