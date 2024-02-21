package com.philiploebl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SpielAendernProg {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Spieler");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Spiel s = new Spiel("Sims", 0, new SpielArt());
        em.persist(s);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
