-- Используем COALESCE для замены NULL в столбце manager на строку 'Не назначен'
-- Сортируем результат по столбцу project_name в алфавитном порядке
select project_id, project_name, COALESCE(manager::TEXT, 'Не назначен') as manager
from projects
order by project_name ASC
