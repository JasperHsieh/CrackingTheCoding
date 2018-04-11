public class OneAway {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        String s1 = "palecc";
        String s2 = "pleccd";
        System.out.println(oneEditAway(s1, s2));
    }
    static boolean oneEditAway(String first, String second){
        if(Math.abs(first.length() - second.length()) > 1){
            return false;
        }
        String short_str = first.length() < second.length()? first: second;
        String long_str = first.length() < second.length()? second: first;

        int index1 = 0;
        int index2 = 0;
        boolean found = false;
        while(index1 < short_str.length() && index2 < long_str.length()){
            if(short_str.charAt(index1) != long_str.charAt(index2)){
                if(found)return false;
                found  = true;
                if(short_str.length() == long_str.length()){
                    index1++;
                }
                index2++;
            }else{
               index1++; 
               index2++; 
            }
        }
        return true;
    }
}
