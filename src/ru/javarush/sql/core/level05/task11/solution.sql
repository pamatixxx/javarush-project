-- Запрос выводит имя сотрудника и статус указания должности
-- Используем оператор CASE и проверку IS NULL для значения position

select
        name,
CASE
    when position is null then 'Position Not Specified'
    when position is not null then 'Position Specified'
END as position_status
from employees