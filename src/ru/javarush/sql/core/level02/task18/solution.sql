-- Выбор имен и возраста студентов старше 21 года с оценками A или B
-- Результаты сортируются по возрасту в порядке возрастания

select name, age
from students
where age > 21 and grade in ('A', 'B')
order by age ASC