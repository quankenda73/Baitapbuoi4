package Buoi5;

import java.util.Scanner;

public class Bai1 {
    public int calculateSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean stop = false;

        System.out.println("Nhập các số nguyên để tính tổng (nhập 'n' để dừng):");

        while (!stop) {
            String input = scanner.nextLine().trim();

            // Kiểm tra nếu người dùng nhập 'n' thì dừng vòng lặp
            if (input.equalsIgnoreCase("n")) {
                stop = true;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Nhập không hợp lệ! Vui lòng nhập lại số nguyên hoặc 'n' để dừng.");
                }
            }
        }

        scanner.close();
        return sum;
    }

    public static void main(String[] args) {
        Bai1 calculator = new Bai1();
        int totalSum = calculator.calculateSum();
        System.out.println("Tổng các số đã nhập là: " + totalSum);
    }
}
