public class URLify {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        String s = "Mr John Smith    ";
        char[] str = s.toCharArray();
        System.out.println(str);
        replaceSpaces(str, 13);
        System.out.println(str);
    }

    static void replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0, index, i = 0;
        for(i=0; i<trueLength; i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount*2 -1;
        for(i=trueLength-1; i>=0; i--){
            if(str[i] == ' '){
                str[index] = '0';    
                str[index-1] = '2';    
                str[index-2] = '%';
                index = index -3;    
            }else {
                str[index] = str[i];
                index--;
            }
        }
    }

}
