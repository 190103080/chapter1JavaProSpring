package chpater1javaspring.controller.db;

import java.util.ArrayList;

public class DBUtil {

    private static ArrayList<Item> items = new ArrayList<>();
    public static Long id = 1L;

    static {
        items.add(new Item(1L, "Macbook Pro 2020", 1499.99, "8 GB RAM", "256 GB SSD", "Intel Core i7"));
        items.add(new Item(2L,"ASUS TUF GAMING", 999.99, "16 GB RAM", "512 GB SSD", "AMD Ryzen 5"));
        items.add(new Item(3L, "Apple IPhone 12 Pro", 1099.99, "6 GB RAM", "128 GB Memory", "Super Retina XDR OLED Display"));
        items.add(new Item(4L, "XIAOMI Redmi Note 8", 199.99, "6 GB RAM", "64 GB Memory", "Android 9 Pie"));
        items.add(new Item(5L,"XIAOMI Redmi Note 10", 299.99, "8 GB RAM", "128 GB Memory", "Android 11"));
        items.add(new Item(6L, "MSI Prestige 15", 1999.99, "Intel@ Core i7", "1024 GB Memory", "32 GB RAM"));
    }

    public static ArrayList<Item> getAllItems() {
        return items;
    }

}
