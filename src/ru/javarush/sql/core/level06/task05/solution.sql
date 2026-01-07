-- Используем LEFT JOIN для объединения таблиц students и enrollments
-- Это позволяет включить всех студентов, даже если они не записаны на курсы
select students.name, enrollments.course
from students LEFT JOIN enrollments
on students.student_id = enrollments.student_id