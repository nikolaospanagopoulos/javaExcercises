public class Car  {
    public String brand;

    public double topSpeed;


    public Car(String brand, double topSpeed){
        this.brand = brand;
        this.topSpeed = topSpeed;
    }

    public void start(){
        System.out.println(this.brand + " is starting");
    };
    public void stop(){
        System.out.println(this.brand + " is stopping");
    };
    public void accelerate(){
        System.out.println(this.brand + " is accelerating");
    };


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}
