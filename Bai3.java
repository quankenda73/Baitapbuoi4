package Buoi5;
public class Bai3 {

    public void printPrimeFactors(int n) {
        if (n <= 1) {
            System.out.println("Không có thừa số nguyên tố cho số " + n);
            return;
        }

        System.out.print("Các thừa số nguyên tố của " + n + " là: ");

        // In ra tất cả các thừa số 2
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // In ra các thừa số lẻ
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        // Trường hợp số nguyên tố lớn hơn sqrt(n)
        if (n > 2) {
            System.out.print(n);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Bai3 calculator = new Bai3();
        
        // Test với các giá trị khác nhau của n
        int n1 = 10;
        int n2 = 13;
        int n3 = 1;

        calculator.printPrimeFactors(n1);
        calculator.printPrimeFactors(n2);
        calculator.printPrimeFactors(n3);
    }
}
