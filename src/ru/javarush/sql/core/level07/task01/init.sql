-- Создание таблицы employees
DROP TABLE IF EXISTS projects;
DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    name TEXT NOT NULL
);

-- Создание таблицы projects
CREATE TABLE projects (
    project_id SERIAL PRIMARY KEY,
    project_name TEXT NOT NULL,
    lead_id INTEGER REFERENCES employees(employee_id)
);

-- Вставка данных в таблицу employees
INSERT INTO employees (name) VALUES
('Алексей'),
('Наталья'),
('Виктор');

-- Вставка данных в таблицу projects
INSERT INTO projects (project_name, lead_id) VALUES
('CRM Система', 1),
('Веб-сайт', 2);