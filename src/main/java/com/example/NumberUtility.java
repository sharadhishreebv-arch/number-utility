
package com.example;

import java.util.Scanner;

public class NumberUtility {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberUtility utility = new NumberUtility();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (utility.isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        sc.close();
    }
}
