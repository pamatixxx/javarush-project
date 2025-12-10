package ru.javarush.java.core.level14.task03;

public class Book {
   private String title;
   private int pages;


    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printInfo(){
       System.out.println("Название: " + title + ", страниц: " + pages);
   }
}
