package com.dsa.patterns;

import java.util.Scanner;

public class ReverseTriangleNumberPattern {

    public static void printInvertedNumberTriangle(int n) {
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print(j+1+" ");
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
         printInvertedNumberTriangle(n);

    }
}
