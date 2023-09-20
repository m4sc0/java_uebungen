public class Character_ {
    public static void main(String[] args) {
        System.out.println(checkChar('A'));
    }

    public static boolean checkChar(Character c) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (abc.contains(c.toString())) return true;
        return false;
    }
}