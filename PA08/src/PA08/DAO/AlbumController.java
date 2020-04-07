package PA08.DAO;

import PA08.Database;

import java.sql.*;

public class AlbumController {
    Connection connection = Database.getConnection();
    Statement statement;
    String sql;
    public void create(String name, int artistId, int releaseYear) {
        try {
            statement = connection.createStatement();
            sql = "INSERT INTO albums(name, artist_id, release_year) VALUES('" + name + "','" + artistId + "','" + releaseYear + "')";
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void findByArtist(int artistId) {
        try {
            statement = connection.createStatement();
            sql = "SELECT name, release_year FROM albums WHERE artist_id = " + artistId;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int releaseYear = rs.getInt("release_year");
                String name = rs.getString("name");
                System.out.println(releaseYear);
                System.out.println(name);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
