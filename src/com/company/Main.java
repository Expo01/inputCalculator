package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner inputScanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (inputScanner.hasNextInt()){
            sum += inputScanner.nextInt();
            count++;
            inputScanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " +  Math.round(sum/count));
        inputScanner.close();
    }
}
