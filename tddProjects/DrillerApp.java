package tddProjects;


public class DrillerApp {
    
    //private int price;
    public int calculatePrice(int numberOfCopies) {
        int totalPrice = 0;

        if (numberOfCopies <= 4) totalPrice = numberOfCopies * 2000;

        if (numberOfCopies >= 5 && numberOfCopies <= 9) totalPrice = numberOfCopies * 1800;

        if (numberOfCopies >= 10 && numberOfCopies <= 29) totalPrice = numberOfCopies * 1600;

        if (numberOfCopies >= 30  && numberOfCopies <= 49) totalPrice = numberOfCopies * 1500;

        if (numberOfCopies >= 50  && numberOfCopies <= 99) totalPrice = numberOfCopies * 1300;

        if (numberOfCopies >= 100  && numberOfCopies <= 199) totalPrice = numberOfCopies * 1200;

        if (numberOfCopies >= 200  && numberOfCopies <= 499) totalPrice = numberOfCopies * 1100;

        if (numberOfCopies >= 500) totalPrice = numberOfCopies * 1000;
        return totalPrice;


    }
 }

