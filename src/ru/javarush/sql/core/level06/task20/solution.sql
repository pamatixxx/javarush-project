-- Используем LEFT JOIN для объединения таблиц students и enrollments
-- и включаем всех студентов, даже тех, у кого нет записей в enrollments

select students.name, courses.course_name
from students
LEFT JOIN enrollments on enrollments.student_id = students.student_id
LEFT JOIN courses on enrollments.course_id = courses.course_id
