package CarInventorySystem;

public class Sedan extends Car {
    private String type = "Sedan";

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
        setType(type);
    }
    @Override public String getInfo(){
        return getVinNumber() +", " + getMake() +", "+  getModel() +", "+ getMileage() +", "+ getType();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}