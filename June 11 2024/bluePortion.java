import java.util.Scanner;
import java.lang.Math;

public class bluePortion {
   public static void main(String []args) {
      Scanner scnr = new Scanner(System.in);

      int side_length = 0;
      int Radius;
      double Area_of_circle;
      double Area_of_square;
      double BlueArea;


      System.out.println("Enter the side length of the square");
      side_length = scnr.nextInt();

      Radius = side_length/2;

      Area_of_circle = Math.PI * Math.pow(Radius,2);
      Area_of_square = side_length * side_length;
      BlueArea = Area_of_square - Area_of_circle;

      System.out.println("The area of the blue portion is " + BlueArea);

      scnr.close();

   }

}


