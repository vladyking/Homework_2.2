package Animals;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public void hunts() {
        System.out.println("I'm hunts!");
    }

    public Amphibians(String animalName, int age, String livingEnvironment) {
        super(animalName, age);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Некорректные данные";
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
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
    public String toString() {
        return "Животное земноводное " + getAnimalName() + ". " + "Количество лет " + getAge() + ". " +
                "Среда обитания " + getLivingEnvironment() + ". ";
    }
}
