package src;
import java.util.Scanner;
public class bai6 {
    public static void main(String [] arg){
        System.out.println("##################################");
        System.out.println("1.              Bài 1");
        System.out.println("2.              Bài 2");
        System.out.println("3.              Bài 3");
        System.out.println("4.              Bài 4");
        System.out.println("5.              Bài 5");
        System.out.println("6.              Thoát");
        System.out.println("##################################");
        System.out.println("Chọn chức năng: _");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        switch (x) {
            case 1:
                bai1.main(arg);
                break;
            case 2:
                bai2.main(arg);
                break;
            case 3:
                bai3.main(arg);
                
                break;
            case 4:
                bai4.main(arg);
                
                break;   
            case 5:
                bai5.main(arg);
                
                break;
            default:
                break;
        }


    }
}
