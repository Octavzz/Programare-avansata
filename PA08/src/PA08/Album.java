package PA08;

import PA08.DAO.AlbumController;

public class Album {
    private Artist artist;
    private String title;
    private int releaseYear, id;
    private AlbumController controller = new AlbumController();

    public Album(String t, Artist a, int ry) {
        this.artist = new Artist(a.getId());
        System.out.println(artist.getId());
        controller.create(t, a.getId(), ry);
        this.title = title;
        this.releaseYear = releaseYear;
        this.id = controller.getID(title);
    }

    public Album(int id) {
        this.id = id;
        this.title = controller.getTitle(id);
        this.releaseYear = controller.getReleaseYear(id);
        this.artist = new Artist(controller.getArtistID(id));
    }

    public int getId() {
        return controller.getID(title);
    }

    public int getArtistID() {
        return controller.getArtistID(id);
    }

    public Artist getArtist() {
        return this.artist;
    }

    public String getArtistName() {
        return this.artist.getName();
    }

    public void setArtist(int id) {
        this.artist = new Artist(id);
    }

    public String getTitle() { return controller.getTitle(id); }




}
