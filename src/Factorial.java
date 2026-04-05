
import java.util.Scanner;

// 1. Encapsulation: We bundle the factorial logic into its own class.
class Factorial {
    
    // The separate function (method) to perform the operation.
    public long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        
        return fact;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer input
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            // 2. Object Creation: We instantiate the class to use its behavior.
            FactorialCalculator calculator = new FactorialCalculator();
            
            // 3. Method Invocation: We call the method on our new object.
            long result = calculator.factorial(n);
            System.out.println(result);
        }
        
        scanner.close();
    }
}
