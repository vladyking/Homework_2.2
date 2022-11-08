package Animals;

public class Herbivore extends Mammal {
    private String foodType;

    public void graze() {
        System.out.println("I'm graze!");
    }

    public Herbivore(String animalName, int age, String livingEnvironment, int movementSpeed, String foodType) {
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
        Herbivore herbivore = (Herbivore) o;
        return foodType.equals(herbivore.foodType);
    }

    @Override
    public String toString() {
        return "Животное травоядное " + getAnimalName() + ". " + "Количество лет " + getAge() + ". " +
                "Среда обитания " + getLivingEnvironment() + ". " + "Скорость передвижения " + getMovementSpeed() + "км/ч. " +
                "Тип пищи " + foodType + ".";
    }
}
