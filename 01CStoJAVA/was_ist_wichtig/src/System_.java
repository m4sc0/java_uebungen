public class System_ {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();

        Math_.Testing();

        long now = System.currentTimeMillis();

        System.out.println(now - before);
    }
}
