package com.philiploebl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JGA_SPIELART")
public class SpielArt {
    @Id
    @Column(length = 3)
    private String krzl;
    @Column(length = 20)
    private String bez;
}
