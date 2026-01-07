package ru.javarush.java.core.level42.task01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Solution {
    public static void main(String[] args) {
        // Имена архива и файла внутри него
        final String ZIP_FILE_DIR = "hello.zip";

        // Текст секретного послания
        final String SECRET_TEXT = "Hello, ZIP!";
        final String HELLO_DIR = "hello.txt";

        // try-with-resources автоматически закроет ZipOutputStream и вложенный FileOutputStream

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(ZIP_FILE_DIR))) {
              zipOutputStream.putNextEntry(new ZipEntry(HELLO_DIR));
              zipOutputStream.write(SECRET_TEXT.getBytes(StandardCharsets.UTF_8));
              zipOutputStream.closeEntry();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}