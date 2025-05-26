package ProblemPractice;

public class FibonacciSeries2 {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i <= 10; i++) {


            int next = num1 + num2;
            System.out.println(next);

            num1 = num2;
            num2 = next;

        }


    }


}
