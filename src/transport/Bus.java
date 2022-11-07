package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, Float maxSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuel);
    }

    @Override
    public void refill() {
        System.out.println(getBrand() + " " + getModel() + " Заправить топливом " + getFuel());
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + "." + " Модель " + getModel() + "." +
                " Год выпуска " + getProductionYear() + "." + " Производство " + getProductionCountry() + "." +
                " Цвет " + getColor() + "." + " Скорость передвижения " + getMaxSpeed() + "." +
                " Тип топлива " + getFuel() + ".";
    }
}
