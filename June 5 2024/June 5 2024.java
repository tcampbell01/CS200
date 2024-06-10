//Complete the code to output "k = " followed by the value of k to four digits after the decimal point. On the same line, output " when m = " followed by the value of m to one digit after the decimal point. End with a newline.
//
//Ex: If the input is 1.6, then the output is:
//
//k = -25.8400 when m = 1.6
//Note: System.out.printf() can be used with "%.Xf" to output a double to X digits after the decimal point.

public class Polynomial {
      public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            double m;
            double k;

            m = scnr.nextDouble();
            k = -(9.0 * m * m) - (0.5 * m) - 2.0;

            /* Your code goes here */
            System.out.printf("k = %.4f when m = %.1f\n", k, m);
      }
}

//The pressure of gas is given by gasPressure = gasVolume / (gasTemperature * 8.314)
//        . Read double variables gasVolume and gasTemperature from input, respectively. Then, compute gasPressure using the formula. Finally, output "Gas pressure is " followed by the value of gasPressure to three digits after the decimal point. End with a newline.
//
//Ex: If the input is 3.0 10.0, then the output is:
//
//Gas pressure is 0.036
//

public class GasPressure {
      public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);

            /* Your code goes here */

            double gasVolumne = scnr.nextDouble();
            double gasTemperature = scnr.nextDouble();

            double gasPressure = gasVolumne / (gasTemperature * 8.314);

            System.out.printf("Gas pressure is " + "%.3f\n", gasPressure);



      }
}

//do as much as you can before lecture!

//getting input from a user:
//first initialize the scanner:
Scanner scnr = new Scanner(System.in);
//then get the input:
m = scnr.nextDouble();
m = scnr.nextInt();

m = scnr.nextFloat();