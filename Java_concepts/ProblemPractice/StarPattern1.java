package ProblemPractice;

public class StarPattern1 {

    public static void main(String[] args) {

        int numb = 5;

        for (int i = 0; i < numb; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}