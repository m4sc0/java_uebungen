package com.philiploebl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Properties;

public class ResetProg {
    public static void main(String[] args) {
        Properties einstellungen = new Properties();
        einstellungen.setProperty("jakarta.persistence.schema-generation.database.action","drop-and-create");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Spieler", einstellungen);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); // Schreibzugriffe müssen innerhalb einer Transaktion erfolgen

        Spieler s1 = new Spieler(0, "Anderson");
        Spieler s2 = new Spieler(0, "Smith");
        Spieler s3 = new Spieler(0, "Doe");

        em.persist(s1);
        em.persist(s2);
        em.persist(s3);

        Spiel sp1 = new Spiel(0, "GTA", 18);
        Spiel sp2 = new Spiel(0, "Fortnite", 6);
        Spiel sp3 = new Spiel(0, "Rocket league", 12);

        em.persist(sp1);
        em.persist(sp2);
        em.persist(sp3);

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Fertig");
    }
}