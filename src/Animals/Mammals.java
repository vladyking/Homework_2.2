package Animals;

public class Mammals extends Animals {
    private String livingEnvironment;
    private int movementSpeed;

    public void walk() {
        System.out.println("I'm walk!");
    }

    public Mammals(String animalName, int age, String livingEnvironment, int movementSpeed) {
        super(animalName, age);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Некорректные данные";
        }
        if (movementSpeed > 0 && movementSpeed <= 390) {
            this.movementSpeed = movementSpeed;
        } else {
            this.movementSpeed = 1;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;

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
