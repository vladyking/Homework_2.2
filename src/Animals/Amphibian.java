package Animals;

public class Amphibian extends Animal {
    private String livingEnvironment;

    public void hunts() {
        System.out.println("I hunt from the brood in the water!");
    }

    public Amphibian(String animalName, int age, String livingEnvironment) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return livingEnvironment.equals(amphibian.livingEnvironment);
    }

    @Override
    public String toString() {
        return "Животное земноводное " + getAnimalName() + ". " + "Количество лет " + getAge() + ". " +
                "Среда обитания " + getLivingEnvironment() + ". ";
    }
}
