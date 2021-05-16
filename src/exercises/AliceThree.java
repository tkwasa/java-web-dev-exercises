package exercises;

import java.util.Scanner;

public class AliceThree {

    public static void main(String[] args) {

        double miles;
        double gallons;
        double rate;
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Enter the miles driven - por favor: ");
        miles = input.nextDouble();

        System.out.println("Enter the gallons consumed - por favor: ");
        gallons = input.nextDouble();

        input.close();

        rate = (miles / gallons);
        System.out.println("The usage rate is : " + rate + " mpg");
    }
}
