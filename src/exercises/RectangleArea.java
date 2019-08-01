package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Integer length;
        Integer width;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter the rectangle length.");
        length = in.nextInt();
        System.out.println("Please enter the rectangle width.");
        width = in.nextInt();

        Integer RecArea = (length) * (width);
        System.out.println("The area of a rectangle is " + RecArea);

    }
}

