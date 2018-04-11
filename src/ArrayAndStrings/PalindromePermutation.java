public class PalindromePermutation {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        String input = "eqabccba";
        System.out.println(input);
        System.out.println(isPermutationOfPalindrome(input));
    }

    static boolean isPermutationOfPalindrome(String phrase){
        int bitVector = createBitVector(phrase);
        return bitVector == 0 || checkOnlyOneBitSet(bitVector); 
    }

    static int createBitVector(String str){
        int bitVector = 0;
        for(char c: str.toCharArray()){
            int index = (int)c - (int)'a';
            bitVector = bitVector ^ (1 << index);
        }
        return bitVector;
    }

    static boolean checkOnlyOneBitSet(int bitVector){
        return (bitVector & (bitVector -1)) == 0;
    }
}
