-- Запрос для выбора сотрудников из IT-департамента с зарплатой больше 70000
select name, department, salary
from employees
where department = 'IT' and salary > 70000

