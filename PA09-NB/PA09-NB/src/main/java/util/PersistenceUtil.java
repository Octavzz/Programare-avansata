/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author octav
 */

public class PersistenceUtil {

    private static EntityManagerFactory emFactory;

    public static EntityManagerFactory getEmFactory() {
        if (emFactory == null) {
            emFactory = Persistence.createEntityManagerFactory("MusicAlbumsPU");
        }
        return emFactory;
    }

    public void closeEmFactory() {
        if (emFactory != null) {
            emFactory.close();
        }
    }
}
