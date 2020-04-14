/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import repo.*;

/**
 *
 * @author octav
 */
public class AlbumManager {

    public static void main(String[] args) {

        Albums album = new Albums(999, "AAAAAA");
        AlbumRepository a = new AlbumRepository();
        a.create(album);

        Artists artist = new Artists(999, "ZZZZZZZ");
        ArtistRepository b = new ArtistRepository();
        b.create(artist);
    }
}
