-- Запрос для присвоения текстовых описаний оценкам
-- Используется конструкция CASE для обработки числовых значений и NULL

select
 case
    when grade is null then 'Не указано'
    when grade = 2 then 'Неудовлетворительно'
    when grade = 3 then 'Удовлетворительно'
    when grade = 4 then 'Хорошо'
    when grade = 5 then 'Отлично'
 end as grade_description
 from students