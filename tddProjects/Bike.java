package tddProjects;

public class Bike {
    //private int speed;

    //private int gear;
    private int acceleration;
    private int deceleration;

    public boolean turnOn() {
        return true;
    }

    public boolean turnOff() {
        return true;
    }

    public int increaseSpeed(int speed, int gear) {
     if (speed == 0 && speed <= 20) acceleration = speed + gear;

     if  (speed == 21 && speed <= 30) acceleration = speed + gear;

     if (speed == 31 && speed <= 40) acceleration = speed + gear;

     if (speed >= 41) acceleration = speed + gear;

     return speed + gear;
    }


    public int decreaseSpeed(int speed, int gear) {
        if (speed == 0 && speed <= 20) deceleration = speed - gear;

        if (speed == 21 && speed <= 30) deceleration = speed - gear;

        if (speed == 31 && speed <= 40) deceleration = speed - gear;

        if (speed >= 40) deceleration = speed - gear;


        return  speed - gear;
    }

    public void changeGear() {
    }
}




