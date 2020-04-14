package PA08;

import PA08.DAO.AlbumController;
import PA08.DAO.ArtistController;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name, country;
    private int id;
    private ArtistController controller = new ArtistController();
    private AlbumController albumController = new AlbumController();
    private int[] albums;

    public Artist(String name, String country) {
        controller.create(name, country);
        this.name = name;
        this.country = country;
        this.id = controller.getID(name);
    }

    public Artist(int id) {
        this.name = controller.getName(id);
        this.country = controller.getCountry(id);
        this.id = id;
        this.albums = this.fetchAlbums();
    }

    public String getName() {
        return controller.getName(id);
    }

    public void setName(String name) {
        controller.setName(name, this.id);
    }

    public String getCountry() {
        return controller.getCountry(id);
    }

    public void setCountry(String country) {
        controller.setCountry(country, this.id);
    }

    public int getId() {
        return controller.getID(name);
    }

    public int getNumberOfAlbums() {
        return albumController.getNumberOfAlbums(id);
    }

    public int[] fetchAlbums() {
        int count = this.getNumberOfAlbums();
        albums = albumController.getAlbumIDs(this.id, count);
        return albums;
    }

    public void getAlbumIDs() {
        int count = this.getNumberOfAlbums();
        for(int i=0;i<count;i++)
            System.out.println(albums[i]);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", id=" + id +
                '}';
    }
}
