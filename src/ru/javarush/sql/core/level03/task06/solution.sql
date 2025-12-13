-- Извлечение текущего года и месяца с использованием функции DATE_PART

select DATE_PART('year', now()) as current_year, DATE_PART('month', now() ) as current_month