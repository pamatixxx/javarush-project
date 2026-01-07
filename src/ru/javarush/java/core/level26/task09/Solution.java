package ru.javarush.java.core.level26.task09;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем дженерик-коллекцию для хранения книг (каталог)
        List<Book> bookList = new ArrayList<>();
        // Добавляем две разные книги с разными названиями и авторами
        bookList.add(new Book("titile1", "author1"));
        bookList.add(new Book("titile2", "author2"));

        // Перебираем каталог и выводим название и автора каждой книги
        bookList.forEach(book -> {
            System.out.println(book.getTitle() + " " + book.getAuthor());
        });
    }
}

// Отдельный класс, представляющий книгу: хранит название и автора
class Book {
    private final String title;
    private final String author;

    // Конструктор инициализирует поля книги
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттеры для доступа к полям
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}