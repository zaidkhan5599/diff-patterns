package com.dsa.patterns;

/**
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 *  * * * *
 *  * * *
 *  * *
 *  *
 */
public class SymmteryPattern {
    static void printSymmetryPattern(int n) {
        for (int i=0; i<2*n; i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for (int j=0; j<stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // entry point - add your logic here
        System.out.println("SymmetryPattern main started");
        // for running multiple test cases to check logic
        int n = 5;
        printSymmetryPattern(n);
    }
}
