package com.tnsif.Lambda;

import java.util.Scanner;

// Functional interface for factorial calculation
@FunctionalInterface
interface Factorial {
    int calculate(int num);
}

public class Find_Factorial {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        int num = scan.nextInt();
        
        // Lambda expression for factorial calculation
        Factorial factorial = (n) -> {
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            return f;
        };
        
        // Calculating factorial using lambda expression
        int result = factorial.calculate(num);
        System.out.println("Factorial of " + num + " is " + result);
        
        scan.close();
    }
}


