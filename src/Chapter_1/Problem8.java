package Chapter_1;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
        System.out.println(isRotation("waterbottle", "noterbottlewat"));
    }
    public static boolean isRotation(String s1 , String s2){
            return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
}
