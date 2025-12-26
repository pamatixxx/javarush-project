-- Используем INNER JOIN для объединения таблиц students и enrollments
-- Объединение выполняется по столбцу student_id, который является общим для обеих таблиц
-- Выбираем только два столбца: name из таблицы students и course_id из таблицы enrollments

select students.name, enrollments.course_id
from enrollments INNER JOIN students
on enrollments.student_id = students.student_id
