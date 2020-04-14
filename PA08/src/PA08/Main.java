package PA08;

import PA08.DAO.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String args[]) {
        ArtistController a = new ArtistController();
        AlbumController b = new AlbumController();
        ChartsController c = new ChartsController();

        //Artist a1 = new Artist("Fanel", "Romania");
        Artist x = new Artist(25);
        //x.getAlbumIDs();
        //b.getAlbumIDs(3,9);
        //System.out.println(x.getName());
        //System.out.println(a1.getId());
        //System.out.println(x.getNumberOfAlbums());


        //b.create("AlbumTest",x.getId(),2020);

        /*Album z1 = new Album(20);
        Album z2 = new Album(25);
        Album z3 = new Album(30);

        c.insertEntry("Top100",z1,3);
        c.insertEntry("Top100",z2,1);
        c.insertEntry("Top100",z3,2); */

        Chart cc = new Chart("Top100");
        cc.printChart();





    }
}
