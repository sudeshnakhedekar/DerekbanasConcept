public class Vehicle extends Crashable implements Drivable, Cloneable {

    int numOfWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;

    public Vehicle() {

    }

    @Override
    public int getWheel() {
        return this.numOfWheels;
    }

    @Override
    public void setWheels(int numWheels) {
this.numOfWheels = numWheels;
    }

    @Override
    public double getSpeed() {
        return this.theSpeed;
    }

    @Override
    public void setSpeed(double speed) {
     this.theSpeed = numOfWheels;
    }

    public Vehicle(int wheels, double speed){
        this.numOfWheels= wheels;
        this.theSpeed= speed;
    }

    @Override
    public void setCarStrength(int carStrength) {
        this.carStrength=carStrength;
    }

    @Override
    public int getCarStrength() {

        return this.carStrength;
    }

    public String toString(){

        return "Num of Wheels: " +this.numOfWheels;

    }
    public Object clone(){

       Vehicle car;
       try {
           car=(Vehicle) super.clone();

       }catch (CloneNotSupportedException e){
 return null;
       }
       return car;
    }
}

