-- Запрос для поиска самой ранней (MIN) и самой поздней (MAX) даты рождения в таблице users
select MIN(birth_date) as oldest_birth_date, MAX(birth_date) as youngest_birth_date
from users