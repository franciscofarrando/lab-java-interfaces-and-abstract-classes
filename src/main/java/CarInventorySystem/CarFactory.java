package CarInventorySystem;

public class CarFactory {
    public static void main(String[] args) {
        Car car1 = new Sedan("4JH324343432KJB432", "VW", "Polo", 10000);
        Car car2 = new UtilityVehicle("2J324KJ324KJ324DA", "FIAT", "Toro", 203232, false);
        Car car3 = new Truck("23BKJ324KN12NK", "TOYOTA", "Hilux", 0, 4.5);


        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
        System.out.println(car3.getInfo());
    }
}
