package com.philiploebl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Spieler {
    @Id
    private int nr;
    private String name;
}
