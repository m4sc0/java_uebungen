package haustier;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Haustier {
    private String name;
    private LocalDate geburtstag;

    public Haustier(String name, LocalDate geburtstag) {
        setName(name);
        setGeburtstag(geburtstag);
    }

//    public Haustier(Haustier alt) {
//        this(alt.getName(), alt.getGeburtstag());
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(LocalDate geburtstag) {
        this.geburtstag = geburtstag;
    }

    public int getNameLaenge() {
        return getName().length();
    }

    public int getAlter() {
        LocalDate jetzt = LocalDate.now();
        int alter = jetzt.getYear() - getGeburtstag().getYear();
        if (jetzt.getMonthValue() > getGeburtstag().getMonthValue()) {
            alter--;
        } else if (jetzt.getMonth() == getGeburtstag().getMonth()
                && jetzt.getDayOfMonth() > getGeburtstag().getDayOfMonth()) {
            alter--;
        }
        return alter;
    }

    public int getAlterInTagen() {
        LocalDate jetzt = LocalDate.now();
        LocalDate geburtstag = getGeburtstag();

        long alterInTagen = ChronoUnit.DAYS.between(geburtstag, jetzt);

        return (int) alterInTagen + 1;
    }

    public void sag(int i) {
        switch (i) {
            case 0:
                sag("Miau");
                break;
            case 1:
                sag("Mimi");
                break;
            default:
                sag("Kann ich nicht");
                break;
        }
    }

    public void sag() {
        sag(0);
    }

    public void sag(String text) {
        System.out.println(text);
    }
}
