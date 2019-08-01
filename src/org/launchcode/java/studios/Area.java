package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Float radius;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the radius of your circle.");
        radius = in.nextFloat();

        double Area = 3.14 * (radius) * (radius);
        System.out.println("The area of a circle of radius " + Area);
    }
}
