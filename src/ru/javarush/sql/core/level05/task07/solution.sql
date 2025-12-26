-- Используем функцию COALESCE для замены NULL значений на 0
select employee_id, name, coalesce(department_id, 0) as resolved_department_id
from employees