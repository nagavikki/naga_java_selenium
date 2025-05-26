package TestProblems;

public class StringCapital {


        public static void main (String [] args)
        {

            String s = "naga vignesh";
            String s5 = "";

           String [] s1 =  s.split(" ");

           for(String s2 : s1) {

               String s3 = s2.substring(0, 1);
               s3 = s3.toUpperCase();
               String s4 = s2.substring(1);
               s2 = s3+ s4;
               s5 = s5+" "+s2;
           }
           System.out.println(s5);
        }}

