package com.firewill;

import java.util.Scanner;

public class Solution4 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a int then double then a string");
        int a = scan.nextInt();
        double b = scan.nextDouble();
        String c = scan.nextLine();

        System.out.println("INT: "+a);
        System.out.println("DOUBLE: "+b);
        System.out.println("STRING: "+c);
    }
    
}
