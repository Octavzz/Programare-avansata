package PA08.DAO;

import java.sql.*;
import java.util.List;

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

    public void setName(String name, int id) {
        try {
            statement = connection.createStatement();
            sql = "UPDATE artists SET name = '" + name + "' WHERE id = " + id;
            statement.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public String getName(int id) {
        try {
            statement = connection.createStatement();
            sql = "SELECT name FROM artists WHERE id = " + id;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                return name;
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return "";
    }

    public void setCountry(String country, int id) {
        try {
            statement = connection.createStatement();
            sql = "UPDATE artists SET country = '" + country + "' WHERE id = " + id;
            statement.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public String getCountry(int id) {
        try {
            statement = connection.createStatement();
            sql = "SELECT country FROM artists WHERE id = " + id;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String country = rs.getString("country");
                return country;
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return "";
    }

    public int getID(String name) {
        try {
            statement = connection.createStatement();
            sql = "SELECT id FROM artists WHERE name = " + "'" + name + "'";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                    return id;
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return -1;
    }

}
