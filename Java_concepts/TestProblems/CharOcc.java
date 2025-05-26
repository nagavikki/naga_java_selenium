package TestProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOcc {

    public static void main(String[] args) {

        String s = "javaselenium";

        Map<Character, Integer> occ = new LinkedHashMap<>();

        for (int i = 0; i <= s.length() - 1; i++) {

            char c = s.charAt(i);

            if (occ.containsKey(c)) {

                int a = occ.get(c);
                occ.put(c, a + 1);
            } else {
                occ.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> occ1 : occ.entrySet()) {

            System.out.println(occ1.getKey() + "," + occ1.getValue());
        }
    }


}
