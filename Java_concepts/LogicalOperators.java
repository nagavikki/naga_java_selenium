public class LogicalOperators
{

    public static void main(String[] args)
    {

        int a = 6;
        int b = 7;

        int c = 9;
        int d = 5;

        boolean boo = a<=b && c==d; 
        /*for && even if 1 false result will be false 
        for || even if one true will be true*/

        System.out.println(boo);

        boolean boo1 = !boo;
        System.out.println(boo1);



    }




}