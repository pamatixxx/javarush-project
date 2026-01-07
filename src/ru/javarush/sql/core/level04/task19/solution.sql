-- Запрос для нахождения общей суммы продаж по каждому отделу
-- Используем агрегатную функцию SUM() для вычисления общей суммы продаж
-- Группируем данные по столбцу department с помощью GROUP BY

select department, SUM(sale_amount) as total_sales
from sales
group by department