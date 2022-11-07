package Animals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №2.3 (Животные):");
        System.out.println();

        System.out.println("Травоядные:");
        Herbivores gazelle = new Herbivores("газель", 3, "саванна", 70, "трава");
        System.out.println(gazelle);
        gazelle.eat();
        gazelle.sleep();
        gazelle.move();
        gazelle.walk();
        gazelle.graze();
        Herbivores giraffe = new Herbivores("жираф", 5, "саванна", 30, "листья");
        System.out.println(giraffe);
        giraffe.eat();
        giraffe.sleep();
        giraffe.move();
        giraffe.walk();
        giraffe.graze();
        Herbivores horse = new Herbivores("лошадь", 7, "степь", 50, "трава");
        System.out.println(horse);
        horse.eat();
        horse.sleep();
        horse.move();
        horse.walk();
        horse.graze();
        System.out.println();

        System.out.println("Хищники:");
        Predators hyena = new Predators("гиена", 3, "саванна", 35, "мясо");
        System.out.println(hyena);
        hyena.eat();
        hyena.sleep();
        hyena.move();
        hyena.hunts();
        Predators tiger = new Predators("тигр", 5, "лес", 50, "мясо");
        System.out.println(tiger);
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.hunts();
        Predators bear = new Predators("медведь", 7, "лес", 35, "рыба");
        System.out.println(bear);
        bear.eat();
        bear.sleep();
        bear.move();
        bear.hunts();
        System.out.println();

        System.out.println("Земноводные:");
        Amphibians frog = new Amphibians("лягушка", 3, "болото");
        System.out.println(frog);
        frog.eat();
        frog.sleep();
        frog.move();
        frog.hunts();
        Amphibians freshwaterSnake = new Amphibians("уж", 5, "озеро");
        System.out.println(freshwaterSnake);
        freshwaterSnake.eat();
        freshwaterSnake.sleep();
        freshwaterSnake.move();
        freshwaterSnake.hunts();
        System.out.println();

        System.out.println("Не летающие:");
        Flightless peacock = new Flightless("павлин", 3, "луг", "на двух лапах");
        System.out.println(peacock);
        peacock.eat();
        peacock.move();
        peacock.hunts();
        Flightless penguin = new Flightless("пингвин", 5, "Южная Африка", "на двух лапах");
        System.out.println(penguin);
        penguin.eat();
        penguin.move();
        penguin.hunts();
        Flightless dodoBird = new Flightless("птица додо", 400, "остров Маврикий", "на двух лапах");
        System.out.println(dodoBird);
        dodoBird.eat();
        dodoBird.move();
        dodoBird.hunts();
        System.out.println();

        System.out.println("Летающие:");
        Flying gull = new Flying("чайка", 3, "побережье", "полёт");
        System.out.println(gull);
        gull.eat();
        gull.move();
        gull.hunts();
        Flying albatross = new Flying("альбатросс", 5, "морской остров", "полёт");
        System.out.println(albatross);
        albatross.eat();
        albatross.move();
        albatross.hunts();
        Flying falcon = new Flying("сокол", 7, "степь", "полёт");
        System.out.println(falcon);
        falcon.eat();
        falcon.move();
        falcon.hunts();
    }
}
