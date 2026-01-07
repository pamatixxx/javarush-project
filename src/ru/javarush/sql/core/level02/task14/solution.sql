-- Запрос для отображения топ-5 сотрудников по зарплате

select name, salary
from employees
order by salary DESC
limit 5