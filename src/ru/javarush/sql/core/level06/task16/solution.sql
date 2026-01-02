-- Запрос для получения списка сотрудников, которые имели посещения только в текущем году

select DISTINCT employees.name as name
from employees
JOIN attendances on attendances.employee_id = employees.id
where YEAR(attendance_date) = YEAR (CURRENT_DATE)