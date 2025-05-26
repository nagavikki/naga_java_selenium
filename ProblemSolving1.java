public class ProblemSolving1{

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) { // Outer loop for 2 to 100
            boolean isPrime = true; // Assume prime
        
            for (int j = 2; j < i;j++) { // Check divisibility
                if (i % j == 0) {
                    isPrime = false; // Not a prime
                    break;
                }
            }
        
            if (isPrime) {
                System.out.println(i); // Print the prime number
            }
        }
    }
    
    
}
