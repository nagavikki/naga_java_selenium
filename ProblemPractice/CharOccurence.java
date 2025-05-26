package ProblemPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurence {

    public static void main(String[] args) {
        String s = "Naga Vignesh";


        String s1 = s.replace(" ", "");

        Map<Character, Integer> occ = new LinkedHashMap<>();


        char[] c = s1.toCharArray();


        System.out.println(c);


        for (char c1 : c) {
            if (occ.containsKey(c1)) {
                int count = occ.get(c1);
                occ.put(c1, count + 1);

            } else {
                occ.put(c1, 1);
            }
        }
        for (Map.Entry<Character, Integer> occtable : occ.entrySet()) {

            //System.out.println(occtable.getKey() + ":" + occtable.getValue());
        }
    }
}

