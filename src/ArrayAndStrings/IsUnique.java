
public class IsUnique {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        //System.out.println("Hello, World");
        boolean ret = isUniqueChars("abcdea");
        System.out.println(ret);
    }

    private static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

}
