-- Запрос для вычисления общей суммы и среднего значения оценок
-- Используем агрегатные функции SUM() и AVG()
-- Значения NULL автоматически игнорируются этими функциями


select SUM(score) as total_score,  AVG (score) as average_score
from students_scores
