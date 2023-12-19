package JavaActivity;
import java.util.Scanner;
public class Cylinder
{
        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);
                double diameter = 0.0, height = 0.0;

                System.out.print("Enter Diameter: ");
                diameter = input.nextDouble();

                System.out.print("Enter Height: ");
                height = input.nextDouble();

                System.out.print("\nLateral surface of the cylinder is " + computeLateralArea(diameter, height));
                System.out.print("Volume of the cylinder is " + computeVolume(diameter/2.0, height));
        }

            public static double computeLateralArea(double d, double h)
            {
                double radius = 0.0;
                double lateralAreaCylinder = 0.0;

                radius = d / 2.0;
                lateralAreaCylinder = 2 * 3.1416 * radius * (radius + h);

                return lateralAreaCylinder;
            }

            public static double computeVolume(double r, double h2)
            {
                return 3.1416 * r * r * h2;
            }
}