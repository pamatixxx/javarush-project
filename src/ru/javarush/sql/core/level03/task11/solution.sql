-- Запрос для получения имен пользователей и длины их имен

select name, LENGTH (name) as name_length
from users
