package TestProblems;

public class SumOfInteger {

    public static void main(String[] args){

//        int a = 1234;
//
//
//        int sum=0;
//
//        String str = Integer.toString(a);
//
//        for(int i=0; i<=str.length()-1; i++){
//
//            char c = str.charAt(i);
//
//           int digit =  Character.getNumericValue(c);
//
//            sum = sum+digit;
//
//    }
//
//        System.out.println(sum);
        int a = 1234;

        int b= 0;
        int c = 0;

        while(a!=0){

            b = a%10;
             c = c+b;
             a = a/10;
        }
        System.out.println(c);

        int a1 = 12345;
        int c1 = 0;

       String s =  Integer.toString(a1);

       for(int i =0; i<s.length(); i++) {

           char c2 = s.charAt(i);

           int b1 = Character.getNumericValue(c2);

           c1 = c1 + b1;

       }
       System.out.println(c1);

}}
