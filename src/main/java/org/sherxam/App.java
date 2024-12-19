package org.sherxam;

public class App {
    public static void main(String[] args) {
        romanToInt();


    }

    private static void romanToInt() {
        String number = "MCMXCIV";
        SolutionRomanToInt toInt = new SolutionRomanToInt();

        int romanToInt = toInt.romanToInt(number);
        System.out.println(romanToInt);
    }


}
