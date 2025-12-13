-- Запрос для объединения имени и фамилии сотрудников в один столбец full_name
select CONCAT(first_name, ' ', last_name) as full_name, employee_id
from employees
