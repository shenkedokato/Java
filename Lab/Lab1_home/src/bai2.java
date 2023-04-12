package src;
import java.util.Scanner;
public class bai2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        int num2 = scanner.nextInt();
        scanner.close();

        int lcm = (num1 > num2) ? num1 : num2;
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}

