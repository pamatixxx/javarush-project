-- Группировка студентов по факультетам и фильтрация факультетов с максимальным возрастом студентов выше 23
select department, MAX(age) as max_age
from students
group by department
having  MAX(age) > 23