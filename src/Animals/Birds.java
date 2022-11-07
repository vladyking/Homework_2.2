package Animals;

public class Birds extends Animals {
    private String movementType;

    public void hunts() {
        System.out.println("I'm hunts!");
    }

    public Birds(String animalName, int age, String movementType) {
        super(animalName, age);
        if (movementType != null && !movementType.isBlank()) {
            this.movementType = movementType;
        } else {
            this.movementType = "Некорректные данные";
        }
    }

    public String getLivingEnvironment() {
        return movementType;
    }

    public void setLivingEnvironment(String movementType) {
        this.movementType = movementType;
    }

    @Override
    public void eat() {
        System.out.println("I'm eat!");
    }

    @Override
    public void move() {
        System.out.println("I'm move!");
    }

}
