package src;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) { // lặp qua các dòng của input
            String input = scanner.nextLine();
            if (isPalindrome(input)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
        scanner.close();
    }

    private static boolean isPalindrome(String input) {
        input = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase(); // bỏ qua các ký tự khác chữ cái và số, chuyển về chữ thường
        for (int i = 0; i < input.length() / 2; i++) { // so sánh với nửa đầu và nửa cuối của chuỗi
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
