package ProblemPractice;

public class Palindrome {

    public static void main(String[] args) {
        String s1 = "Naga";
        String s2 = "";

        /*Basically its like string reverse one reverse done
        we are using the string in build method .equals in our case we used equalsignorecase
        or else we have to convert the given string into smaller case using string in built method
        .lowerCase() we can convert and do operation and compare
         */

        for (int i = s1.length() - 1; i >= 0; i--) {
            char c = s1.charAt(i);

            s2 = s2 + c;
        }

        System.out.println(s2);

        if (s2.equalsIgnoreCase(s1)) {
            System.out.println("Given String is Palindrome");
        } else
            System.out.println("Given String is not a Palindrome");

    }
}
