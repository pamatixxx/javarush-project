-- Соединение таблиц students, courses и enrollments с использованием INNER JOIN
-- Условие соединения: соответствие student_id и course_id в таблице enrollments
-- Выборка только имени студента (name) и названия курса (course_name)

select students.name, courses.course_name
from enrollments
INNER JOIN students on enrollments.student_id = students.student_id
INNER JOIN courses on enrollments.course_id = courses.course_id
