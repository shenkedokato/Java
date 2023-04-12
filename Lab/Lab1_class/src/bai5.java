package src;
import java.util.Scanner;
public class bai5 {
    public static void main(String[]arg){
        Scanner input=new Scanner(System.in);
        Double soDien=input.nextDouble();
        // Đơn vị kw
        Double gia;
        if(soDien<=50){
            gia=soDien*1000*2000;
        }
        else if(soDien>100){
            gia=50*1000*2000+50*1000*2500+(soDien-100)*50*1000*3500;
        }
        else {
            gia=50*1000*2000+(soDien-50)*2500*1000;
        }
        System.out.println(gia);

    }
}