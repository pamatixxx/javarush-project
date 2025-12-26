-- Рассчитываем рентабельность расходов (profitability) с использованием NULLIF()
-- NULLIF(expenses, 0) возвращает NULL, если expenses равно 0, предотвращая деление на ноль

select round(revenue::numeric / nullif (expenses, 0),2) as profitability
from sales