-- Используем агрегатную функцию AVG для вычисления среднего рейтинга
-- Группируем данные по продуктам с помощью GROUP BY
-- Фильтруем продукты с помощью HAVING, оставляя только те, у которых средний рейтинг >= 4
-- Сортируем результат по убыванию среднего рейтинга


select product, AVG(rating) as avg_rating
from reviews
group by product
having avg_rating >= 4
order by avg_rating DESC