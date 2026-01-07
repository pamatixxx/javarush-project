-- Объединение столбцов first_name и last_name в full_name
-- Извлечение уникальных записей с использованием DISTINCT
-- Сортировка по enrollment_year в порядке возрастания

select  DISTINCT   (first_name|| ' ' ||last_name) AS full_name , enrollment_year
from student
ORDER BY enrollment_year ASC