public class Truck extends Car {
    public String cargo;

    public Truck(String brand,double TopSpeed,String cargo){
        super("unknown",0);
        this.cargo = cargo;
    }

    public void start(){}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
