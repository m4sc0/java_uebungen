public class Integer_ {
    public static void main(String[] args) {
        System.out.println(getStringValue("Test", "test2")); // output -> 9
    }

    public static int getStringValue(String str1, String str2) {
        return str1.length() + str2.length();
    }
}
