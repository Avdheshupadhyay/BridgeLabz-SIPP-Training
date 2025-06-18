// MatrixAdvancedOperations.java
// Program to perform matrix transpose and determinant operations
import java.util.Random;
import java.util.Scanner;

public class MatrixAdvancedOperations {
    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }
    // Method to find the transpose of a matrix
    public static int[][] transpose(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] t = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                t[j][i] = mat[i][j];
        return t;
    }
    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] mat) {
        return mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
    }
    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] mat) {
        int a = mat[0][0], b = mat[0][1], c = mat[0][2];
        int d = mat[1][0], e = mat[1][1], f = mat[1][2];
        int g = mat[2][0], h = mat[2][1], i = mat[2][2];
        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }
    // Print matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for square matrix (2 or 3): ");
        int n = sc.nextInt();
        int[][] mat = createRandomMatrix(n, n);
        System.out.println("Matrix:");
        printMatrix(mat);
        System.out.println("Transpose:");
        printMatrix(transpose(mat));
        if (n == 2) {
            System.out.println("Determinant: " + determinant2x2(mat));
        } else if (n == 3) {
            System.out.println("Determinant: " + determinant3x3(mat));
        } else {
            System.out.println("Determinant calculation only for 2x2 or 3x3 matrices.");
        }
        sc.close();
    }
}
