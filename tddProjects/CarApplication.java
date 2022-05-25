package tddProjects;

public class CarApplication {
    public static void main(String[] args) {
        Car toyota = new Car("Latest", "2016", 200.00);
        Car benz = new Car("Latest", "2020", 400.88);

        System.out.printf("The initial price of Toyota is: $%.2f%n" ,toyota.getPrice());
        System.out.printf("The initial price of Benz is: $%.2f%n%n" ,benz.getPrice());

        // Apply a 5% discount on Toyota
        double discount = 5 * 200 / 100;
        System.out.printf("The discount on the price of Toyota  is: $%.2f%n", discount);

        double carPrice = 200.00;
        double newPrice = carPrice - discount;

        System.out.printf("The new price of Toyota is: $%.2f%n%n", newPrice);

        //Apply a 7% discount on Benz

        double nDiscount = 7 * 400.88 / 100;
        System.out.printf("The discount on the price of Benz  is: $%.2f%n", nDiscount);

        double nCarPrice = 400.88;
        double nNewPrice = nCarPrice - nDiscount;

        System.out.printf("The new price of Benz is: $%.2f%n", nNewPrice);

    }
}