
public class Vehicle {
    private String brand;
    private int year;
    private int speed;
    public String type = "Vehicle";

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public Vehicle(){}

    public void setSpeed(int speed){
        if(speed < 0){
            System.out.println("Invalid speed");
        }
        else {
            this.speed = speed;
        }
    }

    public String getBrand(){
        return this.brand;
    }

    public int getYear(){
        return this.year;
    }

    public int getSpeed(){
        return this.speed;
    }

    void describe(){
        System.out.println("Vehicle: " + getBrand() + "(" + getYear() + ")");
    }

    public int accelerate(int amount){
        this.speed += amount;
        return this.speed;
    }
}
