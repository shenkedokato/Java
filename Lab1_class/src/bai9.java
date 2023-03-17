package src;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class bai9 {
    public static void main(String[]arg){
        //Xuất các phần tử trong mảng một chiều. (Hướng dẫn: sử dụng hàm Arrays.toString)
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int [1000];
        nhap(a, n);
        System.out.println(a.toString());
        //Tìm phần tử lớn nhất và nhỏ nhất trong mảng. (Hướng dẫn: Dùng hàm Math.max và Math.min)
        int max=0;
        for(int i=0;i<n-1;i++){
            max=Math.max(a[i],a[i+1]);
        }
        System.out.println(max);
        int min=0;
        for(int i=0;i<n-1;i++){
            min=Math.min(a[i],a[i+1]);
        }
        System.out.println(min);
        //Nhập vào số x, kiểm tra x có nằm trong mảng hay không? (Hướng dẫn: sử dụng hàm Arrays.binarySearch)
        int x=input.nextInt();
        System.out.println(Arrays.binarySearch(a,x));
        //Đếm số phần tử có giá trị bằng x trong mảng (x nhập từ bàn phím).
        int count=0;
        for (int i=0;i<n;i++){
            if(x==a[i]){
                count++;
            }
        }
        System.out.println(count);
        //Sắp xếp mảng một chiều tăng dần.
        Arrays.sort(a);
        for (int m : a) {
            System.out.println(m);
        }





    }
    public static void nhap(int a[],int n){
        Scanner input=new Scanner(System.in);
        for (int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
    }
}
