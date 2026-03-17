package com.dsa.patterns;

import java.util.Scanner;

public class StarPattern {

    public static void printStar(int n) {
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // entry point - add your logic here
        System.out.println("StarPattern main started");
        // for running multiple test cases to check logic
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            printStar(n);
        }
    }
}