import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bonusPercent;
        double salary;

        System.out.print("Enter your bonus %: ");
        bonusPercent = input.nextDouble();

        System.out.print("Enter your salary: ");
        salary = input.nextDouble();

        double bonus = salary * bonusPercent / 100.0;

        System.out.println("Bonus is $" + bonus);

        input.close();
    }
}

import java.util.Scanner;

/*
   This program calculates the miles per gallon for a trip.
*/

public class Mileage_Calculator {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double numMiles = 0;
        double numGalons = 0;

        numMiles = scnr.nextDouble();

        numGalons = scnr.nextDouble();

        double milesPerGallon = numMiles * numGalons;
        System.out.println("Miles per Gallon:" + milesPerGallon);

        scnr.close();
    }
}
