

import java.util.Scanner;

public class Factorial {

    /**
     * Method to calculate factorial of n.
     * Uses a long to handle larger results as factorial grows rapidly.
     */
    public long factorial(int n) {
        if (n < 0) return 0; // Factorial not defined for negative numbers
        
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
            
            // Creating an object to call the instance method factorial()
            FactorialFinder finder = new FactorialFinder();
            long output = finder.factorial(n);
            
            System.out.println(output);
        }
        sc.close();
    }
}
