public class CheckPermutation {

    public static void main(String[] args){
        
        String s = "I have a dog c";
        String t = "dog a have I  ";
        System.out.println(permutation(s, t));
        
    }

    static boolean permutation(String s, String t){
        if(s.length() != t.length()){
            //return false;
        }
        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        for(char c: s_array){
            letters[c]++;
        }
        
        for(int i=0; i<t.length(); i++){
            int c = (int) t.charAt(i);
            System.out.println("c=" + Character.toString((char)c));
            letters[c]--;

            if(letters[c] < 0){
                System.out.println("negative");
                return false;
            }

        }
        for(int i: letters){
            
        }        


        return true;
    }
}
