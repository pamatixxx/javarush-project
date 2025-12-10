-- Извлечение первых 5 строк из таблицы students
-- Используем ключевое слово LIMIT для ограничения количества строк
select id, name, age
from students
LIMIT 5