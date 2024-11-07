package onlineStore;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        // Створення таблиці
        productService.createTable();

        // Додавання нового продукту
        Product product = new Product("Laptop", "A powerful gaming laptop", 1200.99, 10);
        productService.insertProduct(product);

        // Читання всіх продуктів
        productService.readAllProducts();

        // Оновлення ціни продукту
        productService.updateProductPrice(1, 1300.99);

        // Видалення продукту
        productService.deleteProduct(1);
    }
}

