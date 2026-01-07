-- Используем FULL OUTER JOIN для объединения таблиц students и courses
-- Это позволяет включить всех студентов и все курсы, даже если для них нет соответствия
select student_id, name, course_name
from students FULL OUTER JOIN courses
on students.student_id = courses.student_id