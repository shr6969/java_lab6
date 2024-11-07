package onlineStore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadProduct {
    public static void getAllProducts() {
        String selectSQL = "SELECT * FROM Product";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                double price = resultSet.getDouble("price");
                int stockQuantity = resultSet.getInt("stock_quantity");

                System.out.println("Product ID: " + id + ", Name: " + name + ", Description: " + description +
                        ", Price: " + price + ", Stock Quantity: " + stockQuantity);
            }
        } catch (SQLException e) {
            System.out.println("Error reading products: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        getAllProducts();
    }
}

