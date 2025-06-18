// MatrixOperations.java
// Program to perform matrix addition, subtraction, and multiplication
import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = rand.nextInt(10); // 0-9 random
            }
        }
        return mat;
    }
    // Method to add two matrices
    public static int[][] add(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }
    // Method to subtract two matrices
    public static int[][] subtract(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }
    // Method to multiply two matrices
    public static int[][] multiply(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, n = a[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                res[i][j] = 0;
                for (int k = 0; k < n; k++)
                    res[i][j] += a[i][k] * b[k][j];
            }
        return res;
    }
    // Method to print a matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat1 = createRandomMatrix(rows, cols);
        int[][] mat2 = createRandomMatrix(rows, cols);
        System.out.println("Matrix 1:");
        printMatrix(mat1);
        System.out.println("Matrix 2:");
        printMatrix(mat2);
        System.out.println("Addition:");
        printMatrix(add(mat1, mat2));
        System.out.println("Subtraction:");
        printMatrix(subtract(mat1, mat2));
        if (cols == rows) {
            System.out.println("Multiplication:");
            printMatrix(multiply(mat1, mat2));
        } else {
            System.out.println("Multiplication not possible (matrices not square).");
        }
        sc.close();
    }
}
