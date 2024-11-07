package onlineStore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateProduct {
    public static void updateProductPrice(int productId, double newPrice) {
        String updateSQL = "UPDATE Product SET price = ? WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setDouble(1, newPrice);
            preparedStatement.setInt(2, productId);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Product price updated successfully.");
            } else {
                System.out.println("Product update failed.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating product: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        updateProductPrice(1, 999.99);
    }
}

