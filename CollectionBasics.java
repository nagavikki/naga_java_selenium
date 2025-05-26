import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class CollectionBasics {

    public static void main (String[] args)

    {

        List<Integer>num = new ArrayList<Integer>();

        num.add(2);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(6);
        num.add(8);

       //System.out.println(num.indexOf(6));

      int num1 = 6;

      for(int i = 0; i<=num.size()-1; i++)
      {
          if(num.get(i)==num1)
          {
              System.out.println(i);

          }

      }


        //Comparator

    }
}
