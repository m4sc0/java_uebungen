package de.edvschuleplattling.roth.daten;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    @Id
    private int nr;
    private String name;
}


