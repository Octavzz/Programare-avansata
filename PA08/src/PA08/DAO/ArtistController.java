package PA08.DAO;

import PA08.Database;

import java.sql.*;

public class ArtistController {

    Connection connection = Database.getConnection();
    Statement statement;
    String sql;

    public void create(String name, String country) {
        try {
            statement = connection.createStatement();
            sql = "INSERT INTO artists(name, country) VALUES('" + name + "','" + country + "')";
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void findByName(String name) {
        try {
            statement = connection.createStatement();
            sql = "SELECT id, country FROM artists WHERE name = " + "'" + name + "'";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String country = rs.getString("country");
                System.out.println(id);
                System.out.println(country);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
