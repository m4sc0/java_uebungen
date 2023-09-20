import java.util.Random;

public class Arrays_ {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(1, 101);
            System.out.print(nums[i] + ", ");
        }

        System.out.println();
        System.out.println("Is sorted: " + isSorted(nums));

        for (int num : bubbleSort(nums)) {
            System.out.print(num + ", ");
        }

        System.out.println();
        System.out.println("Is sorted: " + isSorted(nums));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) continue;
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
