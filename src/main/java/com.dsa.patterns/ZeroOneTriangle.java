package com.dsa.patterns;

/**
 *
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */
public class ZeroOneTriangle {

    static void triangle(int n) {
        for (int i=0; i<n; i++){
            int start = 1;
            if(i%2 == 0) {
                start = 1;
            }else {
                start = 0;
            }
            for (int j=0; j<=i; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // entry point - add your logic here
        System.out.println("ZeroOneTriangle main started");
        // for running multiple test cases to check logic
        int n = 5;
        triangle(n);
    }
}
