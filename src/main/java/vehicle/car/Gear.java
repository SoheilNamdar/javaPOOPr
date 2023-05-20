package vehicle.car;

public enum Gear {
    AUTOMATIC("Automatique","Otomatic"),
    MANUAL("Manuelle","Dasti");

    private final String toFrench;
    private final String toPersian;

    Gear(String toFrench, String toPersian) {
        this.toFrench = toFrench;
        this.toPersian = toPersian;
    }
    public static void print() {
        Gear[] values = Gear.values();
        for (Gear i : values)
            System.out.println(i);
    }

    public static void printToFrench() {
        Gear[] values = Gear.values();
        for (Gear i : values)
            System.out.println(i.toFrench);
    }

    public static void printToPersian() {
        Gear[] values = Gear.values();
        for (Gear i : values)
            System.out.println(i.toPersian);
    }

    public String toFrench() {
        return toFrench;
    }

    public String toPersian() {
        return toPersian;
    }
}
