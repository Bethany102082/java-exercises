package exercises;

import java.util.Scanner;

public class MilesDriven {
    public static void main(String[] args) {
        Integer miles;
        Integer gas;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles did you drive today?");
        miles = in.nextInt();
        System.out.println("How mant gallons of gas did you use?");
        gas = in.nextInt();

        Integer MilesGas = (miles) / (gas);
        System.out.println("Your miles per gallon is " + MilesGas);


    }
}
