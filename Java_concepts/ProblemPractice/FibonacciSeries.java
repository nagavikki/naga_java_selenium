
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;

        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i <= n; i++) {

            int next = first + second;

            System.out.println(next);

            first = second;
            second = next;

        }
    }
}

/* in this we don't have any input so we assume we are going iterate until 10
so taking first =0 and second =1
iterating until 10 times using for loop
so 0+1 =1
saving this 1 in new variable so now we have 3 variables
first = 0 , second = 1, new = 1;
now we need add second and new right since we have existing condition first+second
we are simply assign second to first and new to second simple
 */