package com.philiploebl;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(callSuper = true)
public class Person extends Spieler {
    private LocalDate geburtstag;

    public Person(String name, SpielStaerke staerke, LocalDate geburtstag) {
        super(name, staerke);
        this.geburtstag = geburtstag;
    }
}
