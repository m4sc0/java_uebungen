public class Math_ {
    public static void main(String[] args) {
        int zahl = 15;
        double quadrat = Math.pow(zahl, zahl);
        double wurzel = Math.sqrt(zahl);
        double cube = Math.multiplyExact(Math.multiplyExact(zahl, zahl), zahl);

        System.out.println(quadrat);
        System.out.println(wurzel);
        System.out.println(cube);
    }
}
