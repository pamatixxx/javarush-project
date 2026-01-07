-- Запрос для получения имен студентов и названий курсов, на которых обучается "Иван Иванов"

select students.name as student_name, courses.name as course_name
from enrollments
INNER JOIN students
    on students.id = enrollments.student_id
INNER JOIN courses
    on courses.id = enrollments.course_id
WHERE students.name = 'Иван Иванов'