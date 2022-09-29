package Task_2_3;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (name == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (name == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Привет!" + " Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + " Будем знакомы!";
    }

}
