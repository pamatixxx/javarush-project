-- Запрос для объединения имени и фамилии в один столбец и форматирования даты рождения


select first_name||''||last_name as full_name, TO_CHAR(birth_date, 'DD-MM-YYYY') as formatted_birth_date
from students