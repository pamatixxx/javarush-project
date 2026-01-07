-- Использование LEFT JOIN для отображения всех сотрудников и их проектов

select employees.name, projects.project_name
from employees left join projects
on employees.employee_id = projects.lead_id