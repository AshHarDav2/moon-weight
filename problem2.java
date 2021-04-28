// ete havasar en false ete che true
package com.company;

public class problem2 {
    public static void main(String[] args) {
        boolean isEqual;
        String text1 = "dog";
        String text2 = "frod";

        int text1Length = text1.length();
        char lastSymbol1 = text1.charAt(text1Length - 1);
        System.out.println(lastSymbol1);

        int text2Length = text2.length();
        char lastSymbol2 = text2.charAt(text2Length-1);
        System.out.println(lastSymbol2);

        isEqual = lastSymbol1 == lastSymbol2;
        System.out.println(isEqual);

    }
}
