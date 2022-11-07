package Animals;

public abstract class Animals {
    private String animalName;
    private int age;

    public void sleep() {
        System.out.println("I'm sleep!");
    }

    public abstract void eat();

    public abstract void move();

    public Animals(String animalName, int age) {
        if (animalName != null && !animalName.isBlank()) {
            this.animalName = animalName;
        } else {
            this.animalName = "Некорректные данные";
        }
        if (age < 0) {
            this.age = 1;
        } else if (age > 0 && age < 100) {
            this.age = age;
        } else if (age >= 100) {
            System.out.println("Данные не корректны, столько не живут или животное вымерло!");
        }
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}