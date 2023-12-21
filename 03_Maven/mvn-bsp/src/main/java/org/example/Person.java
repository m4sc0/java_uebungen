package org.example;

import lombok.*;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Person {
@Getter @Setter    @NonNull private long nr;
@Getter    @NonNull private String name;
@Setter    private LocalDate geb;

    public void setNr(int nr) {
        if(nr<0) throw new IllegalArgumentException("Negativ");
        this.nr = nr;
    }

    public static void main(String[] args) {
        Person p = new Person(-1,"hans",LocalDate.of(2000,1,16));
        System.out.println(p);
    }
}
