package com.philiploebl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SpielAnzeigenProg {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Spieler");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Spiel spiel = em.find(Spiel.class, 3);
        System.out.println(spiel);

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Fertig");
    }
}
