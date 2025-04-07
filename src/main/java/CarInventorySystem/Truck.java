package CarInventorySystem;

public class Truck extends Car {
        private String type = "Truck";
        private double towingCapacity;

        public Truck (String vinNumber, String make, String model, int mileage, double towingCapacity) {
            super(vinNumber, make, model, mileage);
            setType(type);
            this.towingCapacity=towingCapacity;
        }

    @Override public String getInfo(){
        return getVinNumber() +", "+ getMake() +", "+ getModel() +", "+ getMileage() +", "+ getType() +", "+ getTowingCapacity();
        }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }