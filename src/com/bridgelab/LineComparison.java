package com.bridgelab;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparison Problem by using Java");
        // UC2 - As a fan of geometry, I want to check equality of two lines based on the end points, So that I know when two lines are the equal. - Using Java equals

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x1 co-ordinates :: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the y1 co-ordinates :: ");
        int y1 = sc.nextInt();
        System.out.print("Enter the x2 co-ordinates :: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the y2 co-ordinates :: ");
        int y2 = sc.nextInt();

        System.out.print("Enter the a1 co-ordinates :: ");
        int a1 = sc.nextInt();
        System.out.print("Enter the b1 co-ordinates :: ");
        int b1 = sc.nextInt();
        System.out.print("Enter the a2 co-ordinates :: ");
        int a2 = sc.nextInt();
        System.out.print("Enter the b2 co-ordinates :: ");
        int b2 = sc.nextInt();

        double length1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("Length of the line1 is :: "+length1);

        double length2 = Math.sqrt((a2 - a1)^2 + (b2 - b1)^2);
        System.out.println("Length of the line2 is :: "+length2);

        if (length1 == length2)
            System.out.println("Both lines were having same length");
        else
            System.out.println("Both lines were having different length");
    }
}
