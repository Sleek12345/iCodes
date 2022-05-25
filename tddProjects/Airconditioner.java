package tddProjects;

public class Airconditioner {

    private int temperature;


    public int setTemperature() {
        return temperature;
    }



    public boolean turnOn() {
        return true;
    }

    public boolean isOff() {
        return true;
    }

    public boolean isOn() {
        return true;
    }

    public void turnOff() {

    }

    public void increaseTemperature(int amount) {

        if (amount > 0 && amount >= 30 ) {
              temperature = 30;
        }
    }

   public int getTemperature() {
       return temperature;

   }

   public void decreaseTemperature(int amount) {

        if (temperature < amount ) {
            temperature = 16;
       }

   }

    public void decreaseTemperatureBelow16(int amount) {
        if (temperature < 16) {
            temperature = amount;
        }
    }
}