package ProblemPractice;

public class FactorialNumber {

    public static void main(String[] args) {
        int n = 10;

        long l = 1;

        for (int i = 1; i <= n; i++) {

            l = l * i;
        }
        System.out.println(l);
    }
}
