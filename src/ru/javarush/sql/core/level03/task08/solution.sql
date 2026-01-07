-- Преобразование дат и вычисления


select order_id, order_date::DATE, amount
from orders
where amount > 300 AND DATE_PART( 'month' , order_date) = 9 AND DATE_PART( 'year' , order_date) = 2023
