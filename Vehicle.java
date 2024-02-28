public class Vehicle {
    private String type;
    private int modelNumber;
    private int manufactureYear;
    private double price;

    public Vehicle() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();

        System.out.println(" ");
        System.out.println("----Vehicle Information----");
        System.out.println(" ");

        myVehicle.setType("Ciaz");
        myVehicle.setManufactureYear(2016);
        myVehicle.setModelNumber(1235);
        myVehicle.setPrice(9500000.0);
        myVehicle.displayInfo();
    }
}
