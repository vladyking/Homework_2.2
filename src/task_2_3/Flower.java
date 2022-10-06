package task_2_3;

public class Flower {
    String nameFlower;
    private String flowerColor;
    private String country;
    private double cost;
    Integer lifeSpan;

    public Flower(String nameFlower, String flowerColor, String country, double cost, Integer lifeSpan) {
        this.nameFlower = nameFlower;

        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Цветок: " + nameFlower +
                ". Цвет: " + flowerColor +
                ". Страна: " + country +
                ". Стоимость штуки: " + cost + " рублей." +
                " Срок стояния: " + lifeSpan;
    }
}
