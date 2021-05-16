package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        double radius;
        double pi = 3.14;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Enter the radius of your circle in feet - por favor: ");
        radius = input.nextDouble();
        input.close();

        double area = Circle.getArea(radius);

        System.out.println("The area of the circle is : " + area + " ft squared");
    }

}
