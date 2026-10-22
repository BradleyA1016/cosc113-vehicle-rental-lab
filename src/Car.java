public class Car extends Vehicle{
    private int doors;
    String type = "Car";

    public Car(String brand, int year, int doors){
        super(brand, year);
        this.doors = doors;
    }

    void describe(){
        super.describe();
        System.out.println("Doors: " + doors);
    }

    void showType(){
        System.out.println("Type: " + type + "|" + "Parent Type: " + super.type);
    }

    public void setDoors(int doors){
        if(this.doors != 2 || this.doors != 4){
            System.out.println("Invalid door amount");
        }
        else{
            this.doors = doors;
        }
    }

    public int getDoors(){
        return doors;
    }
}
