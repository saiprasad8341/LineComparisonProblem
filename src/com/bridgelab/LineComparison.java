package com.bridgelab;

import java.util.Scanner;


public class LineComparison {
    public static double cal_leg(int x1, int x2, int y1, int y2){
        double length = Math.sqrt(((x2 - x1)^2) + ((y2 - y1)^2));
        return length;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparison Problem by using Java");
        // UC4 - Use Java Object Oriented Programming Concepts of Line and Point as well as equals and compareTo methods.

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

        double length1 = cal_leg(x1, x2, y1, y2);
        System.out.println("Length of the line1 is :: "+length1);

        double length2 = cal_leg(a1, a2, b1, b2);
        System.out.println("Length of the line2 is :: "+length2);

        if (length1 == length2)
            System.out.println("Both lines were having same length");
        else if(length1 > length2)
            System.out.println("Length1 "+length1+" is bigger than Length2 "+length2);
        else
            System.out.println("Length2 "+length2+" is bigger than Length1 "+length1);
    }
}
