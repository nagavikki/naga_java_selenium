package ProblemPractice;

import java.util.Arrays;

public class StringReverse2 {

    public static void main(String[] args)

    {
        String name = "Naga Vignesh";
//        char ch =0;
        String reverseName = "";
        String[] splitName =  name.split(" ");
       // System.out.println(Arrays.toString(splitName));

        for(String splitNames : splitName){

            //System.out.print(splitNames);

        for(int i=splitNames.length()-1; i>=0; i--)

        {
           char  ch = splitNames.charAt(i);
            reverseName = reverseName+ch; // equals to reverseName += ch;
         }

        reverseName = reverseName+" ";

        }


       System.out.println(reverseName.trim());
    }


}
