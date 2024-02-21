package com.philiploebl;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance
@ToString
public abstract class Spieler {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int nr;
    private String name;
    @ManyToOne
    private SpielStaerke spielStaerke;

    public Spieler(String name, SpielStaerke spielStaerke) {
        this(0, name, spielStaerke);
    }
}
