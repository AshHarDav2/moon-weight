//tveri mejtexi tvanshannery havasar en - false che - true
package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        String number1S = String.valueOf(number1);
        String number2S = String.valueOf(number2);

        char averageDigitNumber1 = number1S.charAt(number1S.length()/2);
        char averageDigitNumber2 = number2S.charAt(number2S.length()/2);

        System.out.println("average digit of number 1  = " + averageDigitNumber1);
        System.out.println("average digit of number 2  = " + averageDigitNumber2);

        boolean isEqual;
        isEqual = averageDigitNumber1 == averageDigitNumber2;
        System.out.println(isEqual);
    }
}
