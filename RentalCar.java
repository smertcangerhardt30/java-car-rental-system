package CMPE_113;

import java.util.Scanner;

public class RentalCar {

    String brand;
    double dailyPrice;
    int year;
    boolean isAutomatic;

    public void getData() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Car Brand: ");
        brand = scan.nextLine();

        System.out.println("Year: ");
        year = scan.nextInt();

        System.out.println("Daily Price: ");
        dailyPrice = scan.nextDouble();
        scan.nextLine();

        System.out.println("Type (Automatic/Manual): ");
        String type = scan.nextLine();

        if (type.equalsIgnoreCase("AUTOMATIC")) {
            isAutomatic = true;
        } else {
            isAutomatic = false;
        }
    }

    public void calculateCost(int dayCount) {

        double totalCost;

        if (isAutomatic == true) {
            if (dayCount > 7) {
                totalCost = ((dailyPrice * dayCount) + 500) * 0.9;
                System.out.println("Total Cost: " + totalCost);
            } else {
                totalCost = (dailyPrice * dayCount) + 500;
                System.out.println("Total Cost: " + totalCost);
            }
        } else {
            if (dayCount > 7) {
                totalCost = ((dailyPrice * dayCount)) * 0.9;
                System.out.println("Total Cost: " + totalCost);
            } else {
                totalCost = (dailyPrice * dayCount);
                System.out.println("Total Cost: " + totalCost);
            }
        }
    }

    public void showInfo() {
        String t;

        if (isAutomatic == true) {
            t = "automatic";
        } else {
            t = "manual";
        }

        System.out.println("The car brand: " + brand + "\n" + //
                " Year: " + year + "\n Daily Price: " + dailyPrice
                + "\n Type (Automatic/Manual): " + t);
    }

    public static void main(String[] args) {
        RentalCar car1 = new RentalCar();
        RentalCar car2 = new RentalCar();

        car1.brand = "BMW";
        car1.year = 2002;
        car1.dailyPrice = 2000.0;
        car1.isAutomatic = true;

        car1.showInfo();
        car1.calculateCost(10);

        car2.getData();
        car2.showInfo();
        car2.calculateCost(5);
    }

}