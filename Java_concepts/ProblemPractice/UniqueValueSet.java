package ProblemPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueValueSet {


    public static void main(String[] args) {

        String s = "naga came from naga home";

        String[] s1 = s.split(" ");

        Set<String> dup = new LinkedHashSet<>();

        for (String s2 : s1) {
            dup.add(s2);

        }

        for (String dup1 : dup)
            System.out.println(dup1);
    }
}
