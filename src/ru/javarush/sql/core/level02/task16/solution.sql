-- Запрос для постраничного вывода данных из таблицы students
-- Пропускаем первую строку с помощью OFFSET и ограничиваем результат двумя строками с помощью LIMIT

select student_id, name, age
from students
order by student_id
offset 1
limit 2