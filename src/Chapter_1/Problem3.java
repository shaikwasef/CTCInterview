package Chapter_1;

//Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer NOTE: One or two additional variables are fine An extra copy of the array is not
//        FOLLOW UP
//        Write the test cases for this method

public class Problem3 {
    public static void main(String[] args) {
        String answer = removeDuplicateBuffer();
        System.out.println(answer.toString());
    }

    //Using string buffer input
    public static String removeDuplicateBuffer(){
        StringBuffer val = new StringBuffer("aaaabbbb");
        int checker = 0;
        for(int i = 0 ; i < val.length() ; i++){
            int diff = val.charAt(i) - 'a';
            if((checker&(1<<diff)) > 0){
                val.deleteCharAt(i);
                i--;
                continue;
            }
            checker |= (1<<diff);
        };
        return val.toString();
    }

}
