package ProblemPractice;

public class NumReverse {


    public static void main(String[] args) {

        int num = 156324;
        /*
        catch 1 : in num reverse we are using while loop because
        there is no index value to use if condition

        catch 2: using % we will get the reminder which is last digit we can print straight
        then again do / the same int value so that we will get quotient which is without
        last digit again we have to loop this */


        while (num != 0) {
            int step1 = num % 10;
            System.out.print(step1);
            int step2 = num / 10;
            num = step2;
        }
        //System.out.println(step2);
    }
}
