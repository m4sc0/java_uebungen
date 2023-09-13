// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main  {

    public static Lehrer apfel;

    public static void main(String[] args) {
        apfel = new Lehrer("Apfelbeck", 52, 'm', "BFS2022ik");

        System.out.println(apfel.getName());
        System.out.println(apfel.getAge());
        System.out.println(apfel.getSex());
        System.out.println(apfel.getKlasse());
    }
}