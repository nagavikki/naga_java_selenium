package TestProblems;

public class NumberReverse {

    public static void main (String[] args)

    {
        int a = 45889877;
        int b=0;
        int c=0;

        while(a!=0) {

            b = a % 10;
            System.out.print(b);
            a= a/10;

        }

    }
}
