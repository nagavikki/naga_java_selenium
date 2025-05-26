package ProblemPractice;

import java.util.Arrays;

public class ArraySortingAscending {

    public static void main (String[] args){

        int a[] = {67, 10, 46,21,99,100};

        int b = 0;



        for(int i = 0; i< a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {


                    b = a[i];

                    a[i] = a[j];

                    a[j] = b;


                }

            }

            }
        System.out.println(Arrays.toString(a));

//
//        int c[] = new int[a.length];
//
//        for(int i = 0; i<a.length; i++){
//
//            c[i] = a[i];
//        }
//
//        for(int value : c){
//
//            System.out.println(value);



        }

    }

