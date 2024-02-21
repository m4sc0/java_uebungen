package com.philiploebl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class SpielAnzeigenProg {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Spieler");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

//        Spiel spiel = em.find(Spiel.class, 3);
//        System.out.println(spiel);

//        Spieler spieler = em.find(Spieler.class, 1);
//        System.out.println(spieler);
//
//        TypedQuery<Spieler> q = em.createQuery("select s from Spieler s", Spieler.class);
//        List<Spieler> resultList = q.getResultList();
//        for (Spieler s : resultList) {
//            System.out.println(s);
//        }

//        String sname = "Anderson";
//        TypedQuery<Spieler> q = em.createQuery("select s from Spieler s where s.name = :suchname", Spieler.class);
//        q.setParameter("suchname", sname);
//        List<Spieler> resultList = q.getResultList();
//        for (Spieler s : resultList) {
//            System.out.println(s);
//        }

//        String spielArtBezeichnung = "advanced";
//        TypedQuery<Spieler> q = em.createQuery("select s from Spieler s where s.spielStaerke.bez = :spst", Spieler.class);
//        q.setParameter("spst", spielArtBezeichnung);
//        List<Spieler> resultList = q.getResultList();
//        for (Spieler s : resultList) {
//            System.out.println(s);
//        }

//        String suche = "egz";
//        int freigabeAlter = 16;
//        TypedQuery<Spieler> q = em.createQuery("select s from Spieler s where s.spielStaerke.krzl = :suche and s.", Spieler.class);
//        q.setParameter("suche", suche);
//
//        List<Spieler> resultList = q.getResultList();
//        for (Spieler s : resultList) {
//            System.out.println(s);
//        }

        String suche = "egz";
        int freigabeAlter = 16;
        TypedQuery<Spiel> q = em.createQuery("select s from Spiel s where s.spielArt.krzl = :suche or s.freigabealter > :alter", Spiel.class);
        q.setParameter("suche", suche);
        q.setParameter("alter", freigabeAlter);
        List<Spiel> resultList = q.getResultList();
        for (Spiel s : resultList) {
            System.out.println(s.toString());
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Fertig");
    }
}
