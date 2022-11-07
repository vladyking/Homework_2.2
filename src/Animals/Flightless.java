package Animals;

public class Flightless extends Birds {
    private String movementType;

    public void walk() {
        System.out.println("I'm walk!");
    }

    public Flightless(String animalName, int age, String livingEnvironment, String movementType) {
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
        return "Животное нелетающее " + getAnimalName() + ". " + "Количество лет " + getAge() + ". " +
                "Среда обитания " + getLivingEnvironment() + ". " + "Тип передвижения " + getMovementType() + ".";
    }
}
