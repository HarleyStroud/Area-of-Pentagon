// Harley Stroud, January 28, 2019.

import java.util.Scanner;

public class PentagonArea {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a length value from the center of a pentagon to a vertex, to find the area of the pentagon.");

        double lengthToVertex = input.nextDouble();

        // Use the user input to find the length of a side of the pentagon.
        double pentagonSide = ((2 * lengthToVertex) * (Math.sin(Math.PI / 5)));

        //Use the length of the side found, to find the area of the pentagon.
        double pentagonArea = ((5 * (Math.pow(pentagonSide, 2.0))) / (4 * (Math.tan(Math.PI/ 5))));

        //Output the area of the pentagon rounded to two decimal places.
        System.out.println("The area of the pentagon is " + (Math.round(pentagonArea * 100.0) / 100.0));
    }
}
