-- Извлечение студентов без указанного email
select student_id, name
from students
where email is null