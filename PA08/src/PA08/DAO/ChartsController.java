package PA08.DAO;

import PA08.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ChartsController {
    Connection connection = Database.getConnection();;
    Statement statement;
    String sql;

    public void insertEntry(String chartName, int album_id, int rank) {
        try {
            statement = connection.createStatement();
            sql = "INSERT INTO charts(chart_name, album_id, rank) VALUES(" + "'" + chartName + "', " + album_id + "," + rank + ")";
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void insertEntry(String chartName, Album album, int rank) {
        try {
            statement = connection.createStatement();
            sql = "INSERT INTO charts(chart_name, album_id, rank) VALUES(" + "'" + chartName + "', "  + album.getId() + "," + rank + ")";
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void printChart(String chartName) {
        try {
            statement = connection.createStatement();
            sql = "SELECT * FROM charts where chart_name = " + "'" + chartName + "'" + " order by rank";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int albumID = rs.getInt("album_id");
                int rank = rs.getInt("rank");
                System.out.println("Rank: " + rank);
                System.out.println("AlbumID: " + albumID);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
