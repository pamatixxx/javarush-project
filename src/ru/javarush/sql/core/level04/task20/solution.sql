-- Группировка данных по регионам и вычисление общей суммы заказов
-- Используем агрегатную функцию SUM() для подсчета общей суммы заказов
-- Фильтруем регионы, где общая сумма заказов превышает 600, с помощью HAVING
-- Сортируем результат в порядке убывания общей суммы заказов (DESC)
select region, SUM(total_amount) as total_sales
from orders
group by region
having  SUM(total_amount) > 600
order by SUM(total_amount) DESC
