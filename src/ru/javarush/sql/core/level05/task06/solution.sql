-- Подсчёт строк с заполненными и незаполненными данными в таблице products
select
    count(*) as total_rows,
    count(price) as non_null_prices,
    count(*) - count(price) as null_prices
from products