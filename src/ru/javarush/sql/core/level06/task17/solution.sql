-- Используем SELF JOIN для объединения таблицы employees самой с собой
-- Цель: получить список сотрудников и их менеджеров
select e1.name as employee_name , e2.name AS manager_name
from employees e1 LEFT JOIN employees e2
ON e1.manager_id = e2.employee_id