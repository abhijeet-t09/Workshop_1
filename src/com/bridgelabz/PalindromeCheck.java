package com.bridgelabz;
import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:: ");
        int num=in.nextInt();

        int originalNum=num;
        int revNum=0;
        int rem;

        while (num != 0) {
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num /= 10;
        }

        if (originalNum == revNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }

}
