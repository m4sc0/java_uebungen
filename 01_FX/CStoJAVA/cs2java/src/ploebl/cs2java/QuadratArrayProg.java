package ploebl.cs2java;

public class QuadratArrayProg {
    public static int[] write(int count) {
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = (int) Math.pow(i + 1, 2);
        }
        return res;
    }

    public static int add(int[] arr) {
        int summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe += arr[i];
        }
        return summe;
    }

    public static void main(String[] args) {
        int[] arr = write(2);
        System.out.println("Summe: " + add(arr));
    }
}
