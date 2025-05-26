package ProblemPractice;

public class CapitalLetterAllString {

    public static void main(String[] args) {

        String s = "vignesh rajendran is a king family";

        String s4 = "";
        String s5 = "";
        String s3 = " ";

        /* We are trying to split the string by using space which will give string[]
        so we cannot use normal for loop we are using for each loop and taking one-one word as string then
        converting first letter as caps by using .substring(index position 0,1 which means from 0 to 1 we will have
         only the 1st letter right) method inside the string
        then using the same substring take the reminder words using just by begin index now add these two in new
        string */

        String[] splitwords = s.split(" ");

        for (String splitnew : splitwords) {
            String s1 = splitnew.substring(0, 1);
            String first = s1.toUpperCase();


            String s2 = splitnew.substring(1);
            s3 = first + s2;
            s4 = s4 + s3 + " ";
            //System.out.println(s4);
        }
        System.out.println(s4);
    }
}
