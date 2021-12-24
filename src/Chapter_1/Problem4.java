package Chapter_1;


//Write a method to decide if two strings are anagrams or not

public class Problem4 {
    public static void main(String[] args) {
        boolean answer = checkIfAnagram("listen" , "silent" );
        System.out.println(answer);
    }
    public static boolean checkIfAnagram(String string1 , String string2){
        int[] characters = new int[256];
        for(int i = 0 ; i < string1.length() ; i++){
            characters[(int)string1.charAt(i)] += 1;
        }
        for(int i = 0 ; i < string2.length() ; i++){
            characters[(int)string2.charAt(i)] -= 1;
        }
        for(int i = 0 ; i < characters.length ; i++){
            if(characters[i] != 0){
                return false;
            }
        }
        return true;
    }
}
