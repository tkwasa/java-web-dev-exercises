package exercises;

import java.util.Scanner;

public class AliceTwo {
    public static void main(String[] args) {

        double width;
        double length;
        double area;
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Enter the length of your rectangle - por favor: ");
        length = input.nextDouble();

        System.out.println("Enter the width of your rectangle - por favor: ");
        width = input.nextDouble();

        input.close();

        area = (length * width);
        System.out.println("The area is : " + area + " ft squared");
    }

}
