package com.philiploebl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.Properties;

public class ResetProg {
    public static void main(String[] args) {
        Properties einstellungen = new Properties();
        einstellungen.setProperty("jakarta.persistence.schema-generation.database.action","drop-and-create");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Spieler", einstellungen);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); // Schreibzugriffe müssen innerhalb einer Transaktion erfolgen

        SpielStaerke st1 = new SpielStaerke("beg", "beginner");
        SpielStaerke st2 = new SpielStaerke("adv", "advanced");
        SpielStaerke st3 = new SpielStaerke("exp", "expert");

        em.persist(st1);
        em.persist(st2);
        em.persist(st3);

        Person s1 = new Person("Anderson", st1, LocalDate.now());
        Person s2 = new Person("Smith", st2, LocalDate.now());
        Person s3 = new Person("Trinity", st3, LocalDate.now());

        KISpieler s4 = new KISpieler("Morpheus", st1, false);
        KISpieler s5 = new KISpieler("Das Orakel", st1, true);
        KISpieler s6 = new KISpieler("Agent Johnson", st1, false);

        em.persist(s1);
        em.persist(s2);
        em.persist(s3);
        em.persist(s4);
        em.persist(s5);
        em.persist(s6);

        SpielArt sa1 = new SpielArt("act", "Action");
        SpielArt sa2 = new SpielArt("egs", "Ego Shooter");
        SpielArt sa3 = new SpielArt("fps", "First Person Shooter");

        em.persist(sa1);
        em.persist(sa2);
        em.persist(sa3);

        Spiel sp1 = new Spiel("GTA", 18, sa1);
        Spiel sp2 = new Spiel("Fortnite", 6, sa3);
        Spiel sp3 = new Spiel("Rocket league", 12, sa2);

        em.persist(sp1);
        em.persist(sp2);
        em.persist(sp3);

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Fertig");
    }
}