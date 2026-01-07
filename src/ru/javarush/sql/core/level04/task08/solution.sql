-- Вычисление средней зарплаты сотрудников с зарплатой больше 50000
select AVG(salary) as average_salary
from employees
where salary > 50000 AND salary is not null