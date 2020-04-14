package PA08.DAO;

import java.sql.*;

public class AlbumController {
    Connection connection = Database.getConnection();
    Statement statement;
    String sql;
    public void create(String title, int artistId, int releaseYear) {
        try {
            statement = connection.createStatement();
            sql = "INSERT INTO albums(name, artist_id, release_year) VALUES('" + title + "','" + artistId + "','" + releaseYear + "')";
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
                String title = rs.getString("name");
                System.out.println(releaseYear);
                System.out.println(title);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void setTitle(String title, int id) {
        try {
            statement = connection.createStatement();
            sql = "UPDATE albums SET name = '" + title + "' WHERE id = " + id;
            statement.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public String getTitle(int id) {
        try {
            statement = connection.createStatement();
            sql = "SELECT name FROM albums WHERE id = " + id;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String title = rs.getString("name");
                return title;
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return "";
    }

    public int getID(String title) {
        try {
            statement = connection.createStatement();
            sql = "SELECT id FROM albums WHERE name = " + "'" + title + "'";
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

    public int getReleaseYear(int id) {
        try {
            statement = connection.createStatement();
            sql = "SELECT release_year FROM albums WHERE id = " + id;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int ry = rs.getInt("release_year");
                return ry;
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return -1;
    }

    public void setReleaseYear(int ry) {
        try {
            statement = connection.createStatement();
            sql = "UPDATE albums SET release_year = " + ry;
            statement.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public int getArtistID(int id) {
        try {
            statement = connection.createStatement();
            sql = "SELECT artist_id FROM albums WHERE id = " + id;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int artistID = rs.getInt("artist_id");
                return artistID;
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return -1;
    }

    public int getNumberOfAlbums(int id) {
        try {
            statement = connection.createStatement();
            sql = "SELECT COUNT(*) FROM albums WHERE artist_id = " + id;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int count = rs.getInt("count");
                return count;
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return -1;
    }

    public int[] getAlbumIDs(int id, int count) {
        int[] albumIDs = new int[count];
        int i = 0;
        try {
            statement = connection.createStatement();
            sql = "SELECT id FROM albums WHERE artist_id = " + id;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                albumIDs[i] = rs.getInt(1);
                i++;
            }
            return albumIDs;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("rip");


        return albumIDs;
    }
}
