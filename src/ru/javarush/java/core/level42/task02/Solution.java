package ru.javarush.java.core.level42.task02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Открываем ZIP-архив "hello.zip" из текущей директории
        // try-with-resources гарантирует корректное закрытие потока
        final String ZIP_FILE_DIR = "hello.zip";
        final String HELLO_DIR = "hello.txt";
        try (ZipInputStream zipInputStream = new ZipInputStream(
                new FileInputStream(ZIP_FILE_DIR))) {


            ZipEntry entry = zipInputStream.getNextEntry();
            boolean extracted = false;

            // Перебираем все записи внутри архива

            String name = entry.getName();
            entry.isDirectory();

            // Ищем файл "hello.txt" (игнорируем директории)

            // Создаем выходной файл "output.txt" в текущей директории
            // Поток также будет закрыт автоматически

            byte[] buffer = new byte[8192];
            int read;
            // Копируем данные из текущей записи ZIP в обычный файл


            // Закрываем текущую запись архива и выходим — файл найден и извлечен


            // Переходим к следующей записи


            // Небольшое сообщение, если файл не найден (для наглядности)


            zipInputStream.closeEntry();
        }
    }
}