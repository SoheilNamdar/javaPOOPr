package vehicle;

public class PrintName {
    private Vehicle[] vehicles;

    public PrintName(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
    public String execute() {
        String marks = "";
        //for (Vehicle vehicle : vehicles)
        for (int i=0; i< vehicles.length; i++){
            Vehicle vehicle = vehicles[i];
            if(i != vehicles.length - 1){
                marks = marks + vehicle.getBrand() + "-";
            } else {
                marks = marks + vehicle.getBrand();
            }
        }
        return marks;
    }
}
