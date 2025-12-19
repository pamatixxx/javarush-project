-- Запрос для сортировки студентов по возрасту (убывание) и имени (возрастание)
select id, first_name, last_name, age
from students
ORDER BY  age DESC , first_name ASC