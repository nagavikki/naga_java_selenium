package ProblemPractice;

public class PrintPrimeNumber {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;

            /*basically prime number should divide by its own number and 1 only 2 options
            if its more not a prime number so here we are 2 catch is there
            1. inside loop j<i so that 2 will become false so it won't go in for loop so considered
            is boolean true  and why we are using j means we need to divide the i value with all less value than i
            means if its i=5 then we need divide with 4 3 2 1 so that we can be able to find
            2. second catch is i%j==o which is 5%5 will get 0 only but as per catch 1 it won't check in the way it will
            check 5 with 4 3 2 1 if its 0 then is boolean become false  */

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {

                    isPrime = false;

                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " is Prime Number");
            }

        }

    }

}
