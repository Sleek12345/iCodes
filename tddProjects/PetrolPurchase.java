package tddProjects;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
       if (quantity > 0) {
        this.quantity = quantity;
      }
       this.pricePerLitre = pricePerLitre;
       this.percentageDiscount = percentageDiscount;
    }

    public void setStationLocation(String name){
        stationLocation = name;
    }
    public String getStationLocation(){
        return stationLocation;
    }

    public void setPetrolType(String petrolName){
        petrolType = petrolName;
    }
    public String getPetrolType(){
        return petrolType;
    }

    public void setQuantity(int Tquantity){
        quantity = Tquantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPricePerLitre(double price){
        pricePerLitre = price;
    }
    public double getPricePerLitre(){
        return pricePerLitre;
    }

    public void setPercentageDiscount(double discount){
        percentageDiscount = (discount * pricePerLitre) / 100 ;
    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }


    public double getPurchaseAmount() {
        double purchaseAmount = (quantity * pricePerLitre) - percentageDiscount;

        return purchaseAmount;
    }


}
