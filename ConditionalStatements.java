public class ConditionalStatements

{

    public static void main(String[] args)
    {
        int x = 5;
        double y = 4834.43;

        long l = 74444;
        float f = 767.87f;

        // boolean boo = x>=y && l>=f;
        // System.out.println(boo);

        //boolean b = x>y;

        //System.out.println(b);

        // if(boo!=true)
        // System.out.println("logic true");
        // else
        // System.out.println("logic false");

        //same can be written as 

        if(x>=y && l>=f) //because here the condition gives false so else statement will execute or print//
        System.out.println("logic true");
        //System.out.println("second statement");}

        else
        System.out.println("logic false");
        System.out.println("2nd else statement");

        //when we want to compare 3 values we have 

        if(x>y || y>l)

        System.out.println("x is greater");

        else if(y>x && y>l)

        System.out.println("y is greater");

        else

        System.out.println("l is greater");

        




    }



}