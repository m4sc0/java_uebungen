package com.philiploebl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SpielerAendernProg {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Spieler");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Spieler spieler = em.find(Spieler.class, 1);
        spieler.setName("Neo");

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
