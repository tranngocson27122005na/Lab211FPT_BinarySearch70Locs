package validation;

import java.util.Scanner;

public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    // Kiểm tra số lượng phần tử nhập vào
    public static int checkInput() {
        while (true) {
            try {
                int number = sc.nextInt();
                if (number <= 0) {
                    System.err.println("Number of array must be > 0. Enter again: ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.err.println("Invalid input! Please enter a number: ");
                sc.nextLine();
            }
        }
    }

    // Nhập giá trị cần tìm
    public static int checkValue() {
        while (true) {
            try {
                int value = sc.nextInt();
                return value;
            } catch (Exception e) {
                System.err.println("Invalid input! Please enter a number: ");
                sc.nextLine();
            }
        }
    }
}
