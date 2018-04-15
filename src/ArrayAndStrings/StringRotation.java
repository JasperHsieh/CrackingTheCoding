public class StringRotation {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isRotation(s1,s2));
    }

    static boolean isRotation(String s1, String s2){
        String s1s1 = s1 + s1;

        if(s1.length() == s2.length() && s1.length() != 0){
            return isSubstring(s1s1,s2);
        }
        return false;
    }

    static boolean isSubstring(String str1, String str2){
        int length1 = str1.length();
        int length2 = str2.length();
        for(int i=0; i<length1-length2+1; i++){
            if(str1.substring(i, i+length2).equals(str2)){
                return true;
            }
        }
        return false;
    }
}
