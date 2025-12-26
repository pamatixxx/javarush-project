-- Запрос для выбора сотрудников, у которых department_id равен NULL

select employee_id, name
from employees
where department_id is null