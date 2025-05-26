public class WhileLoop
{
public static void main(String[] args)
{
    int i = 3;
    while(i<=5)
    {
        System.out.println("print i = 5");

        i++;

    }

    //nested while 

    int a = 1;
    while(a<=5)
    {
        System.out.println("Hi");

        int b = 1;

        while(b<=1)
        {
            System.out.println("Good Morning");

            b++;

        }

        a++;
        System.out.println("Condition ends here");

    }

    // // lets see do while 
    // basically do while we are keeping while condition after do means though the condition fail also it will execute once//

    int e = 10;

    do{

        System.out.println("this is do statement");

        e++;

    }

        while(e<=9);

    
    

    }




}




