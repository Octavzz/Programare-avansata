/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

import entity.*;
import util.*;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 *
 * @author octav
 */
public class ArtistRepository {

    public void create(Artists artist) {
        EntityManagerFactory emf = PersistenceUtil.getEmFactory();
        EntityManager em = emf.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        em.persist(artist);
        entityTransaction.commit();
        em.close();
    }

    public Artists findById(int id) {
        EntityManagerFactory emf = PersistenceUtil.getEmFactory();
        EntityManager em = emf.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        Artists artist = em.find(Artists.class, id);
        em.persist(artist);
        entityTransaction.commit();
        em.close();
        return artist;
    }

    public List<Artists> findByName(String name) {
        EntityManagerFactory emf = PersistenceUtil.getEmFactory();
        EntityManager em = emf.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        List<Artists> artists = em.createNamedQuery("Artists.findByName").setParameter("name", name).getResultList();
        em.close();
        return artists;
    }
}
