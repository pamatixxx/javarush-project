-- Группировка студентов по факультетам и подсчёт количества студентов в каждой группе
-- Используем агрегатную функцию COUNT() для подсчёта количества студентов
-- Фильтруем группы, где количество студентов больше двух, с помощью HAVING

select department, COUNT(*) as student_count
from students
where age > 18
group by department
having COUNT(*) > 5