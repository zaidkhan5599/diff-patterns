package com.dsa.patterns;

import java.util.Scanner;

public class ReverseTriangleStarPattern {

    public static void printInvertedStarTriangle(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // entry point - add your logic here
        System.out.println("InvertedTrianglePattern main started");
        // for running multiple test cases to check logic
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printInvertedStarTriangle(n);

    }
}
