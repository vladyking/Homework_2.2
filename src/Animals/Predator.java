package Animals;

public class Predator extends Mammal {
    private String foodType;

    public void hunts() {
        System.out.println("I hunt from ambush in the bushes!");
    }

    public Predator(String animalName, int age, String livingEnvironment, int movementSpeed, String foodType) {
        super(animalName, age, livingEnvironment, movementSpeed);
        if (foodType != null && !foodType.isBlank()) {
            this.foodType = foodType;
        } else {
            this.foodType = "Некорректные данные";
        }
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return foodType.equals(predator.foodType);
    }

    @Override
    public String toString() {
        return "Животное хищное " + getAnimalName() + ". " + "Количество лет " + getAge() + ". " +
                "Среда обитания " + getLivingEnvironment() + ". " + "Скорость передвижения " + getMovementSpeed() + "км/ч. " +
                "Тип пищи " + foodType + ".";
    }
}
