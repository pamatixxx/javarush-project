package ru.javarush.java.core.level48.task10;

public class Main {
    // Имя "рассказчика" — объекта класса Main
    String name = "Main";

    // В этом методе демонстрируем разницу между анонимным классом и лямбдой
    void test() {
        // 1) Анонимный класс с собственным полем name
        Runnable anonymous = new Runnable() {
            String name = "Anonymous"; // свое поле внутри анонимного класса

            @Override
            public void run() {
                // Здесь this — это объект анонимного класса, поэтому выведется "Anonymous"
                System.out.println(this.name);
            }
        };
        // 2) Лямбда-выражение: здесь this — это внешний объект Main
        Runnable r = () -> System.out.println(this.name);

        // Последовательный вызов: сначала анонимный класс, потом лямбда
        anonymous.run();
        r.run();
    }

    public static void main(String[] args) {
        // Создаем объект Main и запускаем демонстрацию
        new Main().test();
    }
}