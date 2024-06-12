import java.util.Scanner;

public class CelsiusToFahrenheit {


    // FINISH: Define celsiusToFahrenheit method here
    public static double celsiusToFahrenheit(double tempC) {
        double tempF = (9.0/5.0) * tempC + 32.0;
        return tempF;
    }
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double tempF;
        double tempC;

        System.out.println("Enter temperature in Celsius: ");
        tempC = scnr.nextDouble();

        // tempF = 0.0; // FIXME

        System.out.print("Fahrenheit: ");
        System.out.println(celsiusToFahrenheit(tempC));


    }
}
