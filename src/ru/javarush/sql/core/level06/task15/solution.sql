-- Запрос для получения имен студентов и названий их курсов, где статус участия равен 'active'
select students.name as student_name, courses.name  as course_name
from students
JOIN enrollments
on enrollments.student_id = students.id and enrollments.status = 'active'
JOIN courses
on enrollments.course_id  = courses.id
