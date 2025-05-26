package ProblemPractice;

public class FirstNonRepeatedCharacter {

    public static void main (String[] args){

        String s = "swiss";

        char c = '0';
        String uni = "";

        boolean isUnique = true;

        for(int i = 0; i<=s.length()-1; i++){

             c = s.charAt(i);

            for(int j =0; j<=s.length()-1; j++)
            {
                char c1 = s.charAt(j);

                if(i!=j && c==c1)

                {
                     isUnique = false;

                     break;

                }

                if(isUnique==false)

                {
                    uni = uni+c;
                    //System.out.println("Non Repeating Letter " + c);
                }
            }


        }
        System.out.println("Non Repeating Letter " + uni);

    }
}
