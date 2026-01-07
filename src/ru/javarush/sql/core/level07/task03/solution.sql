-- Запрос для подсчёта количества курсов для каждого студента
select s.name as student_name,
    (select count(*)
     from enrollments e
     where s.student_id = e.student_idx
     ) as course_count
 from students s