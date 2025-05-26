package TestProblems;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n = 10;

        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);

        int third = 0;

        for (int i = 2; i < n; i++) {

            third = first + second;
            System.out.println(third);
            first = second;
            second = third;

        }


    }
}
