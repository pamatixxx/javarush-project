-- Запрос для объединения имени и фамилии сотрудников в один столбец full_name
select  (first_name || ' ' || last_name) as full_name
from employees
