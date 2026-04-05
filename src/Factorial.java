import java.util.Scanner;

// FIX 1: The public class MUST exactly match the filename Factorial.java
public class Factorial {

    // The separate factorial() function required by the problem statement
    public long factorial(int n) {
        if (n < 0) return 0; // Edge case for negative numbers
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // FIX 2: Create an object of the Factorial class, not FactorialCalculator
            Factorial calculator = new Factorial();
            long output = calculator.factorial(n);
            
            System.out.println(output);
        }
        sc.close();
    }
}
