package com.epam.hometask1;

public class Main1 {

    public static void main(String[] args) {
        String s1 = "We make work HUMAN.";
        String s2 = "Unlock full potential. Celebrate positive moments.";
        String s3 = "Every day.";
        String s4 = s1 + "\n" + s2 + "\n" + s3;
        String s5 = s4.toLowerCase();
        String s6 = s5.replace('e', 'E');
        System.out.println("Initial text is: \n" + s4);
        System.out.println("Length of the second line is: " + s2.length());
        System.out.println("Initial text to lowercase: \n" + s5);
        System.out.println("Updated text with 'e' changed to 'E': \n" + s6);
    }
}
