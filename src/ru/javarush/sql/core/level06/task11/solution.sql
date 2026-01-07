-- Используем LEFT JOIN для объединения таблиц students и enrollments
-- COALESCE заменяет значения NULL в course_name на "Нет курса"

select id, name, COALESCE(course_name, 'Нет курса') as course_name
from students LEFT JOIN enrollments
on students.id = enrollments.student_id