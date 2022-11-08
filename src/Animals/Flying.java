package Animals;

public class Flying extends Bird {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return movementType.equals(flying.movementType);
    }

    @Override
    public String toString() {
        return "Животное летающее " + getAnimalName() + ". " + "Количество лет " + getAge() + ". " +
                "Среда обитания " + getLivingEnvironment() + ". " + "Тип передвижения " + getMovementType() + ".";
    }
}
