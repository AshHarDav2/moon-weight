package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input your weight on earth :");
        int earthWeight = scanner.nextInt();
        double moonWeight = (earthWeight * 17) / 100;
        System.out.println("your weight on moon would be : " + moonWeight);
    }
}
