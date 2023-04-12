 package src;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        // Nhập mảng A
        int a[]=new int [1000];
        nhap(a, n); 
        // Tạo mảng B với các giá trị ngẫu nhiên
        int m = input.nextInt();
        int b[]=new int [1000];
        nhapNgauNhien(b, m);
        System.out.println(Arrays.toString(b));
        // Tạo mảng C từ mảng A
        int[] C = Arrays.copyOf(a, n);

        // Thay thế phần tử thứ 1->3 của mảng C bằng 3 phần tử cuối của mảng B
        System.arraycopy(b, m - 3, C, 0, 3);
        System.out.println(Arrays.toString(C));

        // Sắp xếp mảng C tăng dần và xuất ra màn hình
        Arrays.sort(C);
    }
        public static void nhap(int a[],int n){
            Scanner input=new Scanner(System.in);
            for (int i=0;i<n;i++)
            {
                a[i]=input.nextInt();
            }
        }
        public static void nhapNgauNhien(int a[],int n){
            Scanner input = new Scanner(System.in);
            int m = input.nextInt();
            int[] B = new int[m];
            for (int i = 0; i < m; i++) {
                B[i] = (int) (Math.random() * 100);
            }
        }
}
    

