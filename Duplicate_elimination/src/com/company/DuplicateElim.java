//Robert Marsh
//Oct 21, 2020
//Program takes in numbers between 10 and 100 and checks for duplicates

package com.company;

import java.util.Scanner;

public class DuplicateElim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create scanner

        int numbers[] = new int[5];//create array

        int count = 0;//create count for looping

        //iterate 5 times for length of array
        while (count < 5){
            System.out.print("Enter a number from 10 to 100: ");
            int number = input.nextInt();
            while (number < 10 || number > 100){//check for out of range
                System.out.print("Invalid entry! Enter a number from 10 to 100: ");
                number = input.nextInt();
            }

            boolean flag = false;//boolean flag for checking array for existing number
            for (int i = 0; i < count; i++) {
                if (numbers[i] == number) {
                    flag = true;
                    break;
                }
            }

            if (flag){//if flag was triggered, tell user
                System.out.println(number + " has already been entered!");
                /*for (int n = 0; n < count; n++) {
                    System.out.print(numbers[n] + " ");
                }*/
            }

            else{//if valid entry, add number, increase count, and print array
                numbers[count] = number;
                count++;
                /*for (int n = 0; n < count; n++){
                    System.out.print(numbers[n] + " ");
                }*/
            }
            for (int n = 0; n < count; n++){
                System.out.print(numbers[n] + " ");
            }
            System.out.println();
        }
    }
}
