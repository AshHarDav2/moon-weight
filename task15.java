package com.company;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isEven;

        isEven = number%2==0;
        System.out.println(isEven);
    }
}
