-- Используем COALESCE для замены NULL на 0
-- Используем GREATEST для нахождения наивысшей оценки
-- Используем LEAST для нахождения наименьшей оценки

select student_id,
       GREATEST(COALESCE(exam_1, 0), COALESCE(exam_2, 0),  COALESCE(exam_3, 0)) as highest_score,
       LEAST(COALESCE(exam_1, 0), COALESCE(exam_2, 0), COALESCE(exam_3, 0)) as lowest_score
from student_scores
