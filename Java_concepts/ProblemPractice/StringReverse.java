package ProblemPractice;

public class StringReverse {

    public static void main(String[] args) {

        String name1 = "Naga Vignesh";
        String reverseName = "";

        for (int i = name1.length() - 1; i >= 0; i--) {

            char reverse1 = name1.charAt(i);

            reverseName = reverseName + reverse1;
            // System.out.println(reverseName);
        }
        System.out.println(reverseName);

    }
}
