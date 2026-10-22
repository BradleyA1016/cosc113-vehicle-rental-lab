// 1. The fields should be private so the data being inputed can be verified.
// 2. If the car constructor doesn't call super the constructor cannot be called as constructors aren't inherited.
// 3. this.type refers to the method or constructor the variable is in within it's class. super.type refers to the parent's variable.
public  class Main {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Honda", 2026);
        v1.describe();

        Car c1 = new Car("Jaguar",  2022, 4);
        c1.describe();
        c1.accelerate(35);
        c1.showType();
        c1.setSpeed(-5);
        c1.setDoors(3);
        //c1.speed = 12; returns error: java: speed has private access in Vehicle. This is because the access modifier for the variables is set to private and cannot be accessed just by calling the variable.

        ElectricCar e1 = new ElectricCar("Mustang", 2025, 4, 64);
        e1.describe();
        e1.accelerate(1);
        e1.showType();
        e1.setBatterylevel(110);

    }
}