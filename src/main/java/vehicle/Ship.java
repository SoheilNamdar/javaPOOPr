package vehicle;

public class Ship extends Vehicle {
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public boolean isItThatMovingForward() {
        protectedMethod();
        return false;
    }

    @Override
    public String getBrand() {
        return "Ship";
    }

    public void printReference() {
        System.out.println(this.toString());
    }
    // Overloading
    public void printReferenceObject(Object object) {
        System.out.println(object);
    }
    public void printReferenceObject(String object) {
        System.out.println(object);
    }
    public void printReferenceObject(Object object, String param) {
        System.out.println(object);
    }
    // Overloading doesn't work when return type changes !
//    public String printReferenceObject(Object object) {
//        return object;
//    }
}
