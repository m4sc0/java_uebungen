public class Lehrer extends Person {

    private String klasse;

    public Lehrer(String name, int age, char sex, String klasse) {
        super(name, age, sex);
        setKlasse(klasse);
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }
}
