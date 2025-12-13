-- Запрос для вывода полных имен сотрудников в верхнем регистре
-- Используем CONCAT для объединения имени и фамилии с пробелом
-- Преобразуем результат в верхний регистр с помощью UPPER
select  UPPER(concat(first_name, ' ' ,last_name)) as full_name_upper
from employees