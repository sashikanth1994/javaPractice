package com.firewill;

import java.util.Scanner;

public class Solution1 {
    private static void Solution2(int x){
        Scanner scan = new Scanner(System.in);
        int myInt = scan.nextInt();
        String myString = scan.next();
        System.out.println("My Int is:" + myInt);
        System.out.println("My String is:" + myString);
        System.out.println(x);
    }
    public static void main(String[] args){
        System.out.println("Hello, world");
        System.out.println("Hello, Java");
        Solution2(44);
    }



}
