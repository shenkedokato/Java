package bai10;

import java.util.ArrayList;
import java.util.Scanner;
public class bai10{
    public static void main(String[] arg){
             
        try (Scanner in = new Scanner(System.in)) {
            int a;
            ArrayList<Dien> dsDien = new ArrayList<Dien>();
            while(true){
                System.out.println("Chon loai dien:\n"
                                    +"1.Sinh hoat\n"
                                    +"2.Kinh doanh\n"
                                    +"3.San xuat\n");
                a = in.nextInt();
                if(a==1){
                    Dien dien = new SinhHoat();
                    dien.nhap();
                    if(dien.getMaKH() == null  || dien.getMaKH().isEmpty())
                        break;
                    dsDien.add(dien);
                }
                
                if(a==2){
                    Dien dien = new KinhDoanh();
                    dien.nhap();
                    if(dien.getMaKH() == null  || dien.getMaKH().isEmpty())
                        break;
                    dsDien.add(dien);
                }
                
                if(a==3){
                    Dien dien = new SanXuat();
                    dien.nhap();
                    if(dien.getMaKH() == null  || dien.getMaKH().isEmpty())
                        break;
                    dsDien.add(dien);
                }            
            }
            
            
            System.out.println("Nhap thang hoa don muon xuat:");
            int thang = in.nextInt();
            System.out.println("Nhap nam hoa don muon xuat:");
            int nam= in.nextInt();
            for(int i=0;i<dsDien.size();i++){
                if(dsDien.get(i).getThHD()==thang && dsDien.get(i).getNamHD()==nam)
                    dsDien.get(i).Xuat();
            }
        }
    }
    
}