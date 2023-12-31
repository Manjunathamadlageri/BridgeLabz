package BridgeLabz.Bootcamp;

import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("No real roots exist.");
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: " + root);
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two real roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }
}
