package com.company;


public class Main {

    public static void main(String[] args) {
        String sequence = "just something";
        int sequenceLength = sequence.length();
        char symbol = sequence.charAt(sequenceLength-2);
        System.out.println(symbol);
        System.out.println(sequenceLength);
    }
}
