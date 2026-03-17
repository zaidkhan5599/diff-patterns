package com.dsa.patterns;

import java.util.Scanner;

public class NumberTriangle {
    public static void printNumberTriangle(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // entry point - add your logic here
        System.out.println("TrianglePattern main started");
        // for running multiple test cases to check logic
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printNumberTriangle(n);

    }
}
