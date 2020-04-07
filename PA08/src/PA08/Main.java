package PA08;

import PA08.DAO.AlbumController;
import PA08.DAO.ArtistController;

public class Main {
    public static void main(String args[]) {
        ArtistController a = new ArtistController();
        //a.create("Marcel","Romania");
        a.findByName("Marcel");

        AlbumController b = new AlbumController();
        //b.create("Marcel", 2, 2003);
        b.findByArtist(2);
    }
}
