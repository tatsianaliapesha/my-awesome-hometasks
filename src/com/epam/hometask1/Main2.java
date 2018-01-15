package com.epam.hometask1;

public class Main2 {

    public static void main(String[] args) {
        String s1 = "Globoforce";
        char[] arr1 = s1.toCharArray();
        System.out.println("Array length is: " + arr1.length);
        arr1 = replace(arr1, 'b', '$');
        String s2 = new String(arr1);
        System.out.println("Updated char array is: " + s2);
    }

    private static char[] replace(char[] arr, char oldChar, char newChar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldChar)
                arr[i] = newChar;
        }
        return arr;
    }
}
