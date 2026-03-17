package com.dsa.patterns;

public class ReverseTriangle {

    static void printTriangle(int n) {
        for (int i=0; i<n; i++){
            // print spaces
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            //print stars
            for (int j=0; j<2*n-2*i-1 ; j++){
                System.out.print("*");
            }
            //print spaces
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // entry point - add your logic here
        System.out.println("Triangle main started");
        // for running multiple test cases to check logic
        int n = 5;
        printTriangle(n);
    }
}
