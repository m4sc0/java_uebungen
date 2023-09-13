public class TestProg {

    static double rechne(double a, double b) {
        double summe = a + b;
        return summe / 2;
    }

    public static void main(String[] args) {
        int wert1 = 10;
        double d = rechne(wert1, 5.0);
        System.out.println(d);
    }

}