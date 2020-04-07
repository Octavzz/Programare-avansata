package PA08;

import java.sql.*;

public class Database {
    private static Connection connection;
    private static String url = "jdbc:postgresql://localhost:5432/MusicAlbums";
    private static String username = "dba";
    private static String password = "sql";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Database Connection Creation Failed : " + ex.getMessage());
            }
        }
        return connection;
    }
}