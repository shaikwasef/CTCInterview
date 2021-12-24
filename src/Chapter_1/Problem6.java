package Chapter_1;
//Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees Can you do this in place?
public class Problem6 {
    public static void main(String[] args) {
        int[][] result = getRotate();
        System.out.println(result);
    }
    public static int[][] getRotate(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix[0].length ;
        for(int layer = 0 ; layer < n/2 ; layer++){
            int first = layer ;
            int last = n - layer -1 ;
            for(int i = first; i <  n - layer - 1; i++){
                int offset = i - first ;
                int top = matrix[first][i];
                //left to top
                matrix[first][i] = matrix[last - offset][first];
                // bottom to left
                matrix[last-offset][first] = matrix[last][last - offset];
                //right to bottom
                matrix[last][last - offset] = matrix[i][last];
                //top copy
                matrix[i][last] = top;
            }
        }
        return matrix;
    }
}
