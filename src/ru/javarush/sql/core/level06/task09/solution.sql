-- Используем FULL OUTER JOIN для объединения данных из таблиц authors и books
-- Объединение выполняется по ключу author_id
select author_id, name, title
from authors FULL OUTER JOIN books
on authors.author_id = books.author_id
