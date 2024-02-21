package com.philiploebl;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(callSuper = true)
public class KISpieler extends Spieler {
    private boolean lernfaehig;

    public KISpieler(String name, SpielStaerke staerke, boolean lernfaehig) {
        super(name, staerke);
        this.lernfaehig = lernfaehig;
    }
}
