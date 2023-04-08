package bai5;

import java.util.Scanner;


public class bai5 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            SinhVien a[] = new SinhVien[3];
            for(int i=0;i<3;i++){
                System.out.println("Hay nhap ho va ten:");
                String hoten = in.nextLine();
                System.out.println("Hay nhap mssv:");
                int mssv=in.nextInt();
                System.out.println("Hay nhap diem ly thuyet:");
                float LT = in.nextFloat();
                System.out.println("Hay nhap diem thuc hanh:");
                float TH = in.nextFloat();
                in.nextLine();
                a[i]=new SinhVien(mssv,hoten,LT,TH);         
            }
  
            for (int i=0;i<3;i++) {
                a[i].ToString();
            }
        }
        
    }
    
}
