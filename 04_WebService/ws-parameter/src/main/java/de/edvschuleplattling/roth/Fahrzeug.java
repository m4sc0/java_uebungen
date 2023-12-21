package de.edvschuleplattling.roth;

import lombok.*;

@Data
@AllArgsConstructor
public class Fahrzeug {
    private long nr;
    private String kz;
    private boolean emotor;
}
