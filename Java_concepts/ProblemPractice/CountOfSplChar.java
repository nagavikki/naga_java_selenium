package ProblemPractice;

public class CountOfSplChar {

    public static void main(String[] args) {
        String spl = "V1@#gH457//q";

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        /*so here we are iterating each character under foor loop and using condition like
        in Character Wrapper class we have isDigit for numbers isLowercase for small number
        so using that built in methods we are printing
         */
        for (int i = 0; i <= spl.length() - 1; i++) {
            char c1 = spl.charAt(i);

            if (Character.isUpperCase(c1)) {
                System.out.println("Upper case " + c1);
                a++;
            } else if (Character.isDigit(c1)) {
                System.out.println("Digit " + c1);
                b++;

            } else if (Character.isLowerCase(c1)) {
                System.out.println("Lower Case " + c1);
                c++;

            } else {
                System.out.println("Special Character " + c1);
                d++;

            }
        }
        System.out.println("Total Count of Uppercase " + a);
        System.out.println("Total Count of Lowercase " + c);
        System.out.println("Total Count of Digit " + b);
        System.out.println("Total Count of SplChar " + d);
    }
}
