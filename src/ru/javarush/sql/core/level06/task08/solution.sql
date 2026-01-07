-- Используем RIGHT JOIN для объединения таблиц departments и employees
-- Выбираем все отделы и фильтруем только те, в которых нет сотрудников

select department_name, name
from employees  RIGHT JOIN departments
on employees.department_id = departments.department_id
where employees.employee_id is null