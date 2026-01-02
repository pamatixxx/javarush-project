-- Объединение трех таблиц: students, courses и enrollments
-- Используем множественные INNER JOIN для получения списка студентов и их курсов

select
from enrollments
INNER JOIN students
    on students.id = enrollments.student_id
INNER JOIN courses
    on courses.id = enrollments.course_id