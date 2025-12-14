package ru.javarush.java.core.level23.task20;

public class Product {
    static int totalProductCount;
    String productName;

    public Product(String productName) {
        this.productName = productName;
        totalProductCount++;
    }

    public static int getTotalProductCount() {
        return totalProductCount;
    }

    public static void setTotalProductCount(int totalProductCount) {
        Product.totalProductCount = totalProductCount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
