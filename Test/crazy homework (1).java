package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int[] arr;
        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a new value " + i);
            arr[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(arr) + " original array");
        //end of the first part homework
        int t = 0;
        int k;
        int count;
        for (int c = 0; c < arr.length - 1; c++) {
            count = 0;
            for (k = 0; k < arr.length - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    t = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = t;
                    count++;
                }
            }
            System.out.println(Arrays.toString(arr));
         
            if (count == 0) {
                break;
            }
        }
// end of the second part homework
        //find 80
        int s = 0;
        int f = arr.length;
        while (arr[(s + f) / 2] != 80) {
            if (arr[(s + f) / 2] < 80) {
                s = (s + f) / 2;
            } else {
                f = (f + s) / 2;
            }
        }System.out.println("80 is placed on a position"+ "   " +(s + f) / 2 );
		//end of the third part
    }
      }


