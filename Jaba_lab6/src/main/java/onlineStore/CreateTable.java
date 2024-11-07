package onlineStore;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void createProductTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Product (" +
                "id SERIAL PRIMARY KEY, " +
                "name VARCHAR(100), " +
                "description TEXT, " +
                "price DOUBLE PRECISION, " +
                "stock_quantity INT)";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
            System.out.println("Table 'Product' created successfully.");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        createProductTable();
    }
}

