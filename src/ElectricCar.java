public class ElectricCar extends Car{
    private int batterylevel;

    public ElectricCar(String brand, int year, int doors, int batterylevel) {
        super(brand, year, doors);
        this.batterylevel = batterylevel;
    }
    
    public int getBatterylevel(){
        return batterylevel;
    }
    
    public void setBatterylevel(int batterylevel){
        if(batterylevel>=0 && batterylevel<=100){
            this.batterylevel = batterylevel;
        }
        else{
            System.out.println("Invalid battery level");
        }
    }
    
    public int accelerate(int amount){
        super.accelerate(amount);
        this.batterylevel -= amount;
        return this.batterylevel;
    }

    void describe(){
        super.describe();
        System.out.println("Battery level: " + this.batterylevel);
    }
}
