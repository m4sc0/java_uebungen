public class System_ {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();

        long sum = 0;
        for (long i = 0; i < 1_000_000_000; i++) {
            sum += i;
        }

        long now = System.currentTimeMillis();

        System.out.println(now - before);
    }
}
