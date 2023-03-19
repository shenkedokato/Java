package src;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
public class bai10_class {
    public static void main (String []arg){
        //Nhập vào mảng hai chiều NxN số nguyên, thực hiện các thao tác sau:
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[][]=new int [1000][1000];
        nhap(a,n);
        //Xuất mảng 2 chiều ra màn hình.
        xuat(a,n);
        //Tìm giá trị nhỏ nhất của mảng 2 chiều.
        int min=0;
        int minDong=1000000000;
        for(int i=0;i<n;i++){
            int min1=0;
            for(int j=0;j<n-1;j++){
                min1=Math.min(a[i][j], a[i][j+1]);
            }
            
            min=Math.min(min1,minDong);
            minDong=min1;
        }
        System.out.println(min);
        //Sắp xếp các phần tử trên từng dòng tăng dần.
        for(int i=0;i<n;i++){
            sapXepDong(a[i],n);
        }
        xuat(a,n);
        //Sắp xếp các phần tử trên đường chéo chính tăng dần.
        sapXepCheo(a, minDong);
        xuat(a,n);

    }
    //Nhập vào mảng hai chiều NxN số nguyên
    public static void nhap(int a[][],int n){
        Scanner input=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
    //Xuất mảng 2 chiều ra màn hình.
    }
    public static void xuat(int a[][],int n){
        Scanner input=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
                System.out.print(" ");

                
            }
            System.out.print("\n");

        }
    }
    public static void sapXepDong(int  arr[],int n) {
        int temp = arr[0];
        for (int i = 0 ; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void sapXepCheo(int  arr[][],int n) {
        int temp = arr[0][0];
        for (int i = 0 ; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][i] > arr[j][j]) {
                    temp = arr[j][j];
                    arr[j][j] = arr[i][i];
                    arr[i][i] = temp;
                }
            }
        }
    }
}
