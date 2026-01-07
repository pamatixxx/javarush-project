-- Создание таблицы orders
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS customers;

CREATE TABLE orders (
    order_id SERIAL PRIMARY KEY,
    customer_id INTEGER,
    order_date DATE NOT NULL
);

-- Создание таблицы customers
CREATE TABLE customers (
    customer_id SERIAL PRIMARY KEY,
    name TEXT NOT NULL
);

-- Вставка данных в таблицу orders
INSERT INTO orders (order_id, customer_id, order_date) VALUES
(201, 1, '2024-05-01'),
(202, NULL, '2024-05-02'),
(203, 2, '2024-05-03');

-- Вставка данных в таблицу customers
INSERT INTO customers (customer_id, name) VALUES
(1, 'Антон'),
(2, 'Светлана');