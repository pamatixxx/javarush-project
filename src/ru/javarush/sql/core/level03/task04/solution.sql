-- Запрос для стандартизации email-адресов:
-- функция LOWER() преобразует строку к нижнему регистру,
-- функция UPPER() преобразует строку к верхнему регистру.
select email, LOWER(email) as email_lower, UPPER(email) as email_upper
from customers