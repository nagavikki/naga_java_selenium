package ProblemPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingBasedLastDigit {

    public static void main(String[] args) {

        Comparator<Integer> last = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {

                if (i % 10 > j % 10)
                    return 1;

                else

                    return -1;
            }
        };

        List<Integer> num = new ArrayList<Integer>();

        num.add(93);
        num.add(26);
        num.add(36);


        Collections.sort(num, last);

        for (int sortnum : num) {

            System.out.println(sortnum);
        }


    }

}
