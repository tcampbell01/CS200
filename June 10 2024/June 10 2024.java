//reordering lines example


import java.util.Scanner;

public class Convert {

    public static void main(String []args) {

        Scanner input;

        input = new Scanner("5 6");

        int feet = input.nextInt();
        int inches = input.nextInt();

        double meters = feet * 0.3048 + inches * 0.0254; //meters per foot and meters per inch



        System.out.println( "height in meters: " + meters);




    }
}

//adapting for lighting/thunder

import java.util.Scanner;

public class Convert {

    public static void main(String []args) {

        Scanner input;

        input = new Scanner("41 44");

        final int speed = 1000;

        int lightening_seconds = input.nextInt();
        int thunder_seconds = input.nextInt();

        int distance = lightening_seconds - thunder_seconds * 1000;
        System.out.println("Distance " + distance);



        System.out.println( "height in meters: " + meters);




    }
}