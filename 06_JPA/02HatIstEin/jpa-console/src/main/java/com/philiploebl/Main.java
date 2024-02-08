package com.philiploebl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        //Properties einstellungen = new Properties();
        //einstellungen.setProperty("jakarta.persistence.schema-generation.database.action","drop-and-create");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Spieler");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); // Schreibzugriffe müssen innerhalb einer Transaktion erfolgen

        Spieler s1 = new Spieler(1, "Rayen");
        em.persist(s1);

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Fertig");
    }
}