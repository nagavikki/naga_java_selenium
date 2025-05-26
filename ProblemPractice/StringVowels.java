package ProblemPractice;

public class StringVowels {

    public static void main(String[] args) {

        String str = "NAgo Vignesh";

        String s1 = str.replace(" ", "");

      //  String s1 =s5.toLowerCase(); //converting lower case because java itself case sensitive//

        // System.out.println(s1);


        String s2 = "AEIOUaeiou";

        String s3 = "";

        int a = 0;
        int b = 0;

//        int count = 0;
//


        for (int i = 0; i <= s1.length() - 1; i++) {

            char c = s1.charAt(i);

            s3 = Character.toString(c);


//
//            if(s3.contains(s2)){
//                system.out.println(s3);
//                count++;
//            }

            if (s2.contains(s3)) {

               a++;
                System.out.println(s3 + " is a vowel");

            } else {
                b++;
                System.out.println(s3 + " not vowel");
            }
        }

        System.out.println("Vovwels Count "+ a);
        System.out.println("Constant Count "+ b);


    }
}
