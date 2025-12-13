-- Запрос для получения текущего порта, используемого сервером PostgreSQL
SELECT name, setting
FROM pg_settings
WHERE name = 'port';