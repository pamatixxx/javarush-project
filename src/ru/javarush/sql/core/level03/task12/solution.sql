-- Извлечение домена из email-адресов в таблице users
-- POSITION('@' IN email) возвращает индекс символа '@' в строке email
-- Добавляем +1, чтобы начать сразу после '@' и через SUBSTRING(... FROM start) получить оставшуюся часть строки

select  email, SUBSTRING(email from position('@' in email)+1)  as domain
from users