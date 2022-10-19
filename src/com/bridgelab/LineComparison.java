package com.bridgelab;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparison Problem by using Java");
        // UC1 - As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x1 co-ordinates :: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the y1 co-ordinates :: ");
        int y1 = sc.nextInt();
        System.out.print("Enter the x2 co-ordinates :: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the y2 co-ordinates :: ");
        int y2 = sc.nextInt();

        double length = Math.sqrt((x2 - x1)^2 +(y2 - y1)^2);
        System.out.println("Length of the line is :: "+length);
    }
}
