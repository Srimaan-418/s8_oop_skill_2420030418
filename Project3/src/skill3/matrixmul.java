package skill3;
import java.util.Scanner;
public class matrixmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int r1 = scanner.nextInt();

        System.out.print("Enter the number of columns for the first matrix: ");
        int c1 = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int r2 = scanner.nextInt();

        System.out.print("Enter the number of columns for the second matrix: ");
        int c2 = scanner.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        } else {
            int[][] matrix1 = new int[r1][c1];
            int[][] matrix2 = new int[r2][c2];
            int[][] product = new int[r1][c2];

            System.out.println("\nEnter elements of the first matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("Enter element at [" + i + "][" + j + "]: ");
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nEnter elements of the second matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("Enter element at [" + i + "][" + j + "]: ");
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("\nMatrix 1:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nMatrix 2:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nProduct of the matrices:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
	}

}
