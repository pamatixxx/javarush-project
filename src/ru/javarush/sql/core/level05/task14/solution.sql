-- Запрос для перевода кодов категорий в понятные названия
-- Используется конструкция CASE для обработки каждого возможного значения,
-- в том числе NULL (проверка через IS NULL).
select
        product_id,
        product_name,
        category_code,
    case
        when category_code = 'el' then 'Электроника'
        when category_code = 'frn' then 'Мебель'
        when category_code = 'bks' then 'Книги'
        when category_code is null then 'Не указано'
    end as category_name
from products