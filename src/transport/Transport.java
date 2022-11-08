package transport;

public abstract class Transport {
    //region fields (...)
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private Float maxSpeed;
    private String fuel;
    //endregion

    public Transport(String brand, String model, int productionYear, String productionCountry,
                     String color, Float maxSpeed, String fuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, Float maxSpeed, String fuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    //region Getter and Setter {...}
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Float maxSpeed) {
        if (Float.compare(maxSpeed, 0) == 0) {
            this.maxSpeed = 300.00f;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getFuel() {
        return fuel;
    }
    //endregion

    public abstract void refill();

}
