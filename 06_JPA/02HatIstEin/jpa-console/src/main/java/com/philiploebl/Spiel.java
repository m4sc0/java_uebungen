package com.philiploebl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import  com.philiploebl.SpielArt;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Spiel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int nr;
    @Column(length = 50, unique = true)
    private String titel;
    @Column(name = "F_ALTER")
    private int freigabealter;
    @ManyToOne
    private SpielArt spielArt;

    public Spiel(String titel, int freigabealter, SpielArt art) {
        this(0, titel, freigabealter, art);
    }
}
