package Animals;

public class Flying extends Birds {
    private String movementType;

    public void fly() {
        System.out.println("I'm fly!");
    }

    public Flying(String animalName, int age, String livingEnvironment, String movementType) {
        super(animalName, age, livingEnvironment);
        if (movementType != null && !movementType.isBlank()) {
            this.movementType = movementType;
        } else {
            this.movementType = "Некорректные данные";
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    @Override
    public String toString() {
        return "Животное летающее " + getAnimalName() + ". " + "Количество лет " + getAge() + ". " +
                "Среда обитания " + getLivingEnvironment() + ". " + "Тип передвижения " + getMovementType() + ".";
    }
}
