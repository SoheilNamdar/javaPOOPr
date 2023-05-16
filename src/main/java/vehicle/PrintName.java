package vehicle;

public class PrintName {
    Vehicle[] vehicle;

    public PrintName(Vehicle[] vehicles) {
        this.vehicle = vehicles;
    }

    public String execute() {
        String brands = "";
        for (int i=0; i<vehicle.length; i++) {
            if (i < vehicle.length-1 ) {
                brands += vehicle[i].getBrand() + "-";
            } else {
                brands += vehicle[i].getBrand();
            }
        }
        return brands;
    }
}
