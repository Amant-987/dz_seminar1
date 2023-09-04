package org.dz1;

public class Main {
    public static void main(String[] args) {
        // Создание категорий
        Category electronics = new Category("Electronics");
        Category books = new Category("Books");

        // Создание товаров
        Product laptop = new Product("Laptop", 1500.0, 4);
        Product phone = new Product("Phone", 800.0, 5);
        Product book1 = new Product("Book 1", 20.0, 3);
        Product book2 = new Product("Book 2", 15.0, 4);

        // Добавление товаров в категории
        electronics.addProduct(laptop);
        electronics.addProduct(phone);
        books.addProduct(book1);
        books.addProduct(book2);

        // Создание пользователей
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // Добавление товаров в корзину пользователей
        user1.getBasket().addProduct(laptop);
        user1.getBasket().addProduct(book1);
        user2.getBasket().addProduct(phone);
        user2.getBasket().addProduct(book2);

        // Вывод каталога продуктов
        System.out.println("Catalog:");
        System.out.println("Category: " + electronics.getName());
        for (Product product : electronics.getProducts()) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }
        System.out.println("Category: " + books.getName());
        for (Product product : books.getProducts()) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }

        // Вывод покупок пользователей
        System.out.println("\nPurchases:");
        System.out.println("User: " + user1.getBasket());
        for (Product product : user1.getBasket().getPurchasedProducts()) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }
        System.out.println("User: " + user2.getBasket());
        for (Product product : user2.getBasket().getPurchasedProducts()) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }
    }
}