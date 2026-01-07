-- Группировка студентов по факультетам и подсчёт количества студентов в каждой группе
-- Используем агрегатную функцию COUNT() для подсчёта количества студентов
-- Фильтруем группы, где количество студентов больше двух, с помощью HAVING

select product_id, SUM(sales_amount) as total_sales
from sales
group by product_id
having SUM(sales_amount)  > 500
