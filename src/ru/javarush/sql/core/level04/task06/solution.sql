-- Рассчитываем общую сумму продаж для категории 'electronics'
select SUM(sale_amount) as total_electronics_sales
from sales
where sale_category = 'electronics'