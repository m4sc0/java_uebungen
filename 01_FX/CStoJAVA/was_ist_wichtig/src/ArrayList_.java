import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        double avg = 0;
        for (int i = 0; i < nums.stream().count(); i++) {
            avg += nums.get(i);
        }

        avg = avg / nums.stream().count();
        System.out.println(avg);
    }
}
