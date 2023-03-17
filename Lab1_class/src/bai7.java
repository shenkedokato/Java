package src;
import java.util.Scanner;
public class bai7 {
    public static void main (String[]arg){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println(laSoNT(a));
    }
    public static boolean laSoNT(int n) {
        if (n <= 1) {
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
