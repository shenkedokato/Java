package src;
import java.util.*;
public class bai6 {
 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so dong cua mang A: ");
        int n = input.nextInt();
        System.out.print("Nhap so cot cua mang A: ");
        int m = input.nextInt();

        int[][] A = new int[n][m];

        // Nhap gia tri cho mang A
        System.out.println("Nhap gia tri cho mang A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = input.nextInt();
            }
        }

        // Tim phan tu lon nhat cua mang A
        int max = A[0][0];
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.printf("Phan tu lon nhat cua mang A la %d tai vi tri A[%d][%d].\n", max, maxRow, maxCol);

        // Tim va in ra cac so nguyen to cua mang A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPrime(A[i][j])) {
                    System.out.printf("%d ", A[i][j]);
                } else {
                    A[i][j] = 0;
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // Sap xep cac cot cua mang A theo thu tu tang dan
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n - 1; i++) {
                for (int k = i + 1; k < n; k++) {
                    if (A[i][j] > A[k][j]) {
                        int temp = A[i][j];
                        A[i][j] = A[k][j];
                        A[k][j] = temp;
                    }
                }
            }
        }

        // In mang A sau khi sap xep
        System.out.println("Mang A sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", A[i][j]);
            }
            System.out.println();
        }
    }

    // Ham kiem tra so nguyen to
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}




