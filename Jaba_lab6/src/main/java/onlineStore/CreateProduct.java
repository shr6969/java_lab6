package onlineStore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateProduct {
    public static void insertProduct(String name, String description, double price, int stockQuantity) {
        String insertSQL = "INSERT INTO Product (name, description, price, stock_quantity) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, description);
            preparedStatement.setDouble(3, price);
            preparedStatement.setInt(4, stockQuantity);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Product inserted successfully.");
            } else {
                System.out.println("Product insertion failed.");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting product: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        insertProduct("Laptop", "A powerful gaming laptop", 1200.99, 10);
    }
}
