package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:

        int bobSalary = 100000;
        int garySalary = 70000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: " + highestSalary);


        // Question 2:

        int carPrice = 22000;
        int truckPrice = 150000;

        System.out.println("The cheapest car is: " + Math.min(carPrice, truckPrice));

        // Question 3:

        double circleRadius = 7.25;
        double area = (Math.PI * circleRadius * circleRadius);
        System.out.println("The area of the circle is: " + area);

        // Question 4:

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of 5.0 is: " + squareRoot);

        // Question 5:

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between (5, 10) and (85, 50) is: " + distance);

        // Question 6:

        double variable = -3.8;

        System.out.println("The absolute value is: " + Math.abs(variable));

        // Question 7:

        System.out.println("The random number is: " + Math.random());

        //Question 8:

        int days = 24;
        int hours = 24 * days;
        int minutes = 60 * hours;

        System.out.println("There are " + minutes + " minutes in " + days + " days.");

        // Bonus

        int seconds = 60 * minutes;
        int miliseconds = 1000 * seconds;

        System.out.println("There are " + miliseconds + " miliseconds in " + days + " days.");

    }
}