-- Создание таблицы students
DROP TABLE IF EXISTS enrollments;
DROP TABLE IF EXISTS students;

CREATE TABLE students (
    student_id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    group_id INTEGER NOT NULL
);

-- Создание таблицы enrollments
CREATE TABLE enrollments (
    enrollment_id SERIAL PRIMARY KEY,
    student_id INTEGER NOT NULL REFERENCES students(student_id),
    course_id INTEGER NOT NULL
);

-- Вставка данных в таблицу students
INSERT INTO students (name, group_id) VALUES
('Елена', 101),
('Иван', 102),
('Ольга', 101);

-- Вставка данных в таблицу enrollments
INSERT INTO enrollments (student_id, course_id) VALUES
(1, 201),
(1, 202),
(2, 203),
(3, 201),
(3, 202);