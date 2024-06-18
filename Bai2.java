package Buoi5;

public class Bai2 {

    public int calculateSumofProduct(int n) {
        int sum = 0;
        StringBuilder expression = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            int product = 1;
            StringBuilder term = new StringBuilder("1");
            
            for (int j = 1; j <= i; j++) {
                product *= j;
                term.append(" * ").append(j);
            }
            
            expression.append(term);
            sum += product;
            
            if (i < n) {
                expression.append(" + ");
            }
        }
        
        System.out.println("Biểu thức: " + expression.toString());
        System.out.println("Tổng: " + sum);
        
        return sum;
    }

    public static void main(String[] args) {
        Bai2 calculator = new Bai2();
        int n = 3; // Đổi số nếu cần
        calculator.calculateSumofProduct(n);
    }
}
