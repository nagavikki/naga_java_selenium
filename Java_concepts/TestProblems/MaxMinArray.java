package TestProblems;

public class MaxMinArray {

    public static void main (String [] args){

        int a[] = {10,9,28,11,50};

        int min = a[0];
        int max = a[0];



        for(int i = 0; i< a.length; i++){

            for(int j = i+1; j< a.length; j++){

                if(a[i]<a[j]){

                     min = a[i];

                }

                if(a[i]>a[j]){

                     max = a[j];
                }


            }

        }

        System.out.println(min);
        System.out.println(max);


    }

}
