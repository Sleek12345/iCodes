//package FirstCodes;

import java.util.Scanner;

public class CostOfDriving{

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the driving distance : ");
            int drivingDistance = input.nextInt();

            System.out.print("Enter the miles per gallon : ");
            int milesPerGallon = input.nextInt();

            System.out.print("Enter the price per gallon : ");
            int pricePerGallon = input.nextInt();


           int CostOfDriving = drivingDistance / milesPerGallon * pricePerGallon;

            System.out.printf("CostOfDriving is %d%n", CostOfDriving);

        }

    }











