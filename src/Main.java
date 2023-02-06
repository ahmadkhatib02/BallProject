import java.util.Scanner;
import java.lang.Math;
// This program lets you calculate the volume and the radius of a sphere just by inserting its density and mass
public class Main {
    public static void main(String[] args) {
        double density, mass , volume, radius;
        Scanner scan= new Scanner (System.in);
        System.out.print("Enter the value of the density: "+ "(in kg/m³)");
        density=scan.nextDouble();
        System.out.print("Enter the value of the mass: "+ "(in kg)");
        mass= scan.nextDouble();
        volume= mass / density;
        System.out.println("Your volume is: " + volume+ " m³");
        radius=((3/4.0)* (1/Math.PI) * volume);
        System.out.print("Your radius is: " + Math.pow(radius, 1/3.0)+ " m");

    }
}