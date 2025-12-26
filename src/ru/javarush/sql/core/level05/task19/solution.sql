-- Запрос для вычисления средней зарплаты с учетом NULL (замена NULL на 0) и без учета NULL
select  ROUND(avg(COALESCE(salary, 0)),2) as avg_salary_with_null, ROUND(avg(salary),2)  as avg_salary_without_null
from employees

