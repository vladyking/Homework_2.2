package Animals;

public class Bird extends Animal {
    private String movementType;

    public void hunts() {
        System.out.println("I hunt insects!");
    }

    public Bird(String animalName, int age, String movementType) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return movementType.equals(bird.movementType);
    }

}
