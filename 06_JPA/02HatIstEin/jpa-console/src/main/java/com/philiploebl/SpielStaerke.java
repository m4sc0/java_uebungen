package com.philiploebl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JGA_SPIEL_STAERKE")
public class SpielStaerke {
    @Id
    @Column(length = 3)
    private String krzl;
    @Column(length = 20)
    private String bez;
}