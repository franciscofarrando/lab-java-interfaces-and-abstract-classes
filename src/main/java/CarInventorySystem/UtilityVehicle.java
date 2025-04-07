package CarInventorySystem;

public class UtilityVehicle extends Car {
     private String type = "Utility";
     private boolean fourWheelDrive;

        public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
            super(vinNumber, make, model, mileage);
            setType(type);
            this.fourWheelDrive=fourWheelDrive;
        }

    @Override public String getInfo(){
        return getVinNumber() +", "+ getMake() +", "+ getModel() +", "+ getMileage() +", "+ getType() +", "+ isFourWheelDrive();
        }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

