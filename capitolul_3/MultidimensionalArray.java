package capitolul_3;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++){
            for (int j = 0; j < twoD[i].length; j++){
                System.out.println(twoD[i][j] + " "); // print element
                System.out.println(); // time for a new row
            }
        }
    }
}
