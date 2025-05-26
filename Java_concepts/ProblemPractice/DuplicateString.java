package ProblemPractice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateString {

    public static void main(String[] args) {
        String s = "Nanjil came from nanjil home";

        Map<String, Integer> dup = new LinkedHashMap<>();

        String s1 = s.toLowerCase();

        String[] s2 = s1.split(" ");

        for (String s3 : s2) {
            if (dup.containsKey(s3)) {
                int count = dup.get(s3);
                dup.put(s3, count + 1);

            } else {
                dup.put(s3, +1);

            }
        }
        System.out.println(dup);

        //if(dup.getValue()>1)
       // if(dup.containsKey("nanjil")) here also contains returns boolean so we cant use this way as well//

        /* So to iterate map value we have to use entry set concept in map
        and also we cant use the if condition straight away in map
        because of this key value e.g.see the above if condition like that we cant use becuase we dont know what we
        are going to fetch using get and what we are going to validate but if we know the key value like specific
        string or character instead of using getValue we can use contains*/

        for (Map.Entry<String, Integer> dup1 : dup.entrySet()) {
            if (dup1.getValue() > 1) {
                System.out.println(dup1.getKey() + ":" + dup1.getValue());

            }

        }

    }
}

