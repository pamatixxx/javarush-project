-- Запрос для преобразования числового значения total_amount в строку с добавлением текста " USD"
-- и формирования нового столбца formatted_amount
select sale_id, product_name, cast(total_amount as text) || ' USD' as formatted_amount
from sales
