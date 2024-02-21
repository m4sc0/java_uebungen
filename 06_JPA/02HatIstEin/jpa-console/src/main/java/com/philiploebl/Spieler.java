package com.philiploebl;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString
public abstract class Spieler {
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private int nr;
    private String name;
    @ManyToOne
    private SpielStaerke spielStaerke;

    public Spieler(String name, SpielStaerke spielStaerke) {
        this(0, name, spielStaerke);
    }
}
