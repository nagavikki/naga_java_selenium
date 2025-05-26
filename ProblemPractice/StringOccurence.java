package ProblemPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurence {

    public static void main(String[] args) {
        String s = "Nanjil came from nanjil house";

        Map<String, Integer> occ = new LinkedHashMap<>();

        String s1 = s.toLowerCase();

        String[] s2 = s1.split(" ");

        for(String s3 : s2)

        {
            if(occ.containsKey(s3))
            {
                int count = occ.get(s3);
                occ.put(s3, count+1);

            }

            else
            {
                occ.put(s3, 1);

            }

        }

        for(Map.Entry<String,Integer> occ1:occ.entrySet())
        {

           String key =  occ1.getKey();
           int value = occ1.getValue();

           System.out.println(key+ ":" + value);

        }

    }
}
