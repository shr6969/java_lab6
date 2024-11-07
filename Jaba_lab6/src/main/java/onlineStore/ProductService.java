package onlineStore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    public void createTable() {
        try {
            // Логування інформації
            logger.info("Creating Product table...");

            // Логіка створення таблиці
        } catch (Exception e) {
            // Логування помилки
            logger.error("Error creating table: " + e.getMessage());
        }
    }

    public void insertProduct(Product product) {
        try {
            logger.info("Inserting a new product...");
            // Логіка вставки продукту
        } catch (Exception e) {
            logger.error("Error inserting product: " + e.getMessage());
        }
    }

    public void readAllProducts() {
        try {
            logger.info("Reading all products...");
            // Логіка читання продуктів
        } catch (Exception e) {
            logger.error("Error reading products: " + e.getMessage());
        }
    }

    public void updateProductPrice(int productId, double newPrice) {
        try {
            logger.info("Updating product price...");
            // Логіка оновлення ціни
        } catch (Exception e) {
            logger.error("Error updating product price: " + e.getMessage());
        }
    }

    public void deleteProduct(int productId) {
        try {
            logger.info("Deleting product...");
            // Логіка видалення продукту
        } catch (Exception e) {
            logger.error("Error deleting product: " + e.getMessage());
        }
    }
}
