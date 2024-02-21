package com.philiploebl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Properties;

public class SpielerAnzeigenProg {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Spieler");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); // Schreibzugriffe müssen innerhalb einer Transaktion erfolgen

        Spieler spieler = em.find(Spieler.class, 4);
        System.out.println(spieler);

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Fertig");
    }
}