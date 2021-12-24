package Chapter_1;
import java.util.*;

//Implement an algorithm to determine if a string has all unique characters What if you
//        can not use additional data structures?

public class Problem1 {
    public static void main(String[] args) {

        boolean answer = checkingStringWithBit();
        System.out.println(answer);
    }
    //Algorithm 1
    public static boolean checkingStringByAsci(){
        String sentence = "wefshaik";
        boolean[] checker = new boolean[123];
        for (int i = 0; i < sentence.length(); i++) {
            if (checker[(int) sentence.charAt(i)]) {
                return true;
            }
            checker[(int) sentence.charAt(i)] = true;
        }
        return false;
    }

    //Algorithm 2
    public static boolean checkingStringWithBit(){
        String sentence = "wefshaik";
        int checker = 0 ;
        for(int i = 0 ; i < sentence.length() ; i++){
            int val = sentence.charAt(i) - 'a';
            if((checker&(1<<val)) > 0) {
                return true;
            }
            checker = checker | (1 << val);
        }
        return false;
    }
}
