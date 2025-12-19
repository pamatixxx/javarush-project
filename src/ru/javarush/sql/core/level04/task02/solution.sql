-- Выбор пользователей с планами "premium" или "basic", у которых подписка еще активна
select plan_type, end_date
from subscriptions
where end_date >= CURRENT_DATE AND (plan_type = 'basic' OR plan_type = 'premium')

