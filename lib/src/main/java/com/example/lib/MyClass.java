package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int num1 = scanner.nextInt();
        String[] array = new String[]{"¹s","³ü","¶L","°Ñ","¸v","¥î","³°","¬m","®Ã","¨h"} ;

        System.out.println(array[num1]);

    }
}
