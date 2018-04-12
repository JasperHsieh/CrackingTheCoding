public class StringCompression {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        String s = "aabcccccaaa";
        String s2 = "abcde";
        System.out.println(compress(s));
    }

    static String compress(String str){
        
        int charCount = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            charCount++;
            if(i+1 == str.length() || str.charAt(i) != str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(charCount);
                charCount = 0;
            }
        }

        return sb.toString().length() < str.length()? sb.toString(): str;
    }

}
