package transport;

public class Train extends Transport {
    private double costTravel;
    private double timeTravel;
    private String departureStation;
    private String arrivalStation;
    private int quantityWagons;

    public Train(String brand, String model, int productionYear, String productionCountry,
                 Float maxSpeed, String departureStation, String arrivalStation,
                 double costTravel, int quantityWagons, String fuel) {
        super(brand, model, productionYear, productionCountry, maxSpeed, fuel);
        this.costTravel = costTravel;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.quantityWagons = quantityWagons;
    }

    public double getCostTravel() {
        return costTravel;
    }

    public void setCostTravel(double costTravel) {
        this.costTravel = costTravel;
    }

    public double getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(double timeTravel) {
        this.timeTravel = timeTravel;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public int getQuantityWagons() {
        return quantityWagons;
    }

    public void setQuantityWagons(int quantityWagons) {
        this.quantityWagons = quantityWagons;
    }

    @Override
    public void refill() {
        System.out.println(getBrand() + " " + getModel() + " Заправить топливом " + getFuel());
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + "." + " Модель " + getModel() + "." +
                " Год выпуска " + getProductionYear() + "." + " Производство " + getProductionCountry() + "." +
                " Скорость передвижения " + getMaxSpeed() + "." +
                " Отходит от " + departureStation + "." + " Следует до станции " + arrivalStation + "." +
                " Цена билета " + costTravel + "." + " В поезде вагонов " + quantityWagons + ".";
    }
}
