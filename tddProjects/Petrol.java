package tddProjects;

public class Petrol {
    public static void main(String[] args) {
         PetrolPurchase good = new PetrolPurchase("Lagos","Complete", 30, 1000, 15);

        System.out.printf("The name of the location where the station is located is %s%n", good.getStationLocation());
        System.out.printf("The name of the petrol type is %s%n", good.getPetrolType());
        System.out.printf("Quantity of the petrol is %dlitres%n", good.getQuantity());
        System.out.printf("The price per litre of the petrol is $%.2f%n", good.getPricePerLitre());
        System.out.printf("The percentage discount of the price of petrol is %.2f%%%n", good.getPercentageDiscount());
        System.out.printf("The purchase amount of the petrol is %.2f%n", good.getPurchaseAmount());

















    }
}
