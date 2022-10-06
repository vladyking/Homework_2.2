package task_2_3;

import transport.Car;

public class Main {

    public static void main(String[] args) {

        Human maxim = new Human(1987, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(1994, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань", null);

        System.out.println("Задание №1:");

        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println();

        System.out.println("Задание №1 (Инкапсуляция):");
        System.out.println(vladimir);
        System.out.println();

        System.out.println("Задание №2.2 (Инкапсуляция):");

        Car ladaGranta = new Car("lada", "Granta", 1.6, "Yellow",
                "Russia", 2015, "МКПП",
                "Sedan", "a111aa999", 5, true);

        Car audiA8L50TDIQuattro = new Car("Audi", "A8 L 50 TDI Quattro", 3.0, "Black",
                "Germany", 2020, "АКПП", "Sedan",
                "b222bb888", 5, true);

        Car bmwZ8 = new Car("BMW", "Z8", 4.9, "Black",
                "Germany", 2003, "АКПП", "Roadster",
                "c333cc777", 2, true);

        Car kiaSportage4 = new Car("KIA", "Sportage4", 2.4, "Red",
                "South Korea", 2018, "АКПП", "Сrossover",
                "d444dd666", 5, true);

        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Orange",
                "South Korea", 2016, "АКПП", "Sedan",
                "e555ee555", 5, true);

        System.out.println(ladaGranta);
        System.out.println(audiA8L50TDIQuattro);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);
        System.out.println();

        ladaGranta.setRegistrationNumber("a111aa999");
        System.out.println("Проверка правильности написания номера авто. Номер введен корректно(true)/некорректно(false) - " + ladaGranta.checkRegNumber());
        System.out.println();

        System.out.println("Задание №2.1 (Инкапсуляция):");

        Flower roza = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 2);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15.00, 5);
        Flower peony = new Flower("Пион", null, "Англия", 69.90, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.50, 10);

        System.out.println(roza);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);
        System.out.println();

        calculateCostBouquet(roza, roza, roza,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila);
        calculateMinStandTime(roza, roza, roza,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila);

//        double checkPriceBouquet = ((roza.getCost()*3) + (chrysanthemum.getCost()*5) + (gypsophila.getCost()))*1.10;
//        System.out.printf("Подсчет стоимости букета (проверка) %s%n", String.format("%.2f", checkPriceBouquet) + " рублей");
    }

    private static void calculateCostBouquet(Flower... flowers) {
        double resultCost = 0;
        double floristPercent = 1.10;
        System.out.println("Букет состоит из цветов:");
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                resultCost += flowers[i].getCost();
            }
            System.out.println(flowers[i]);
        }
        resultCost *= floristPercent;
        System.out.println("Букет стоит " + String.format("%.2f", resultCost) + " рублей");

    }

    private static void calculateMinStandTime(Flower... flowers) {
        int minLifeSpan = Integer.MAX_VALUE;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null && flowers[i].lifeSpan < minLifeSpan)
                minLifeSpan = flowers[i].lifeSpan;
        }
        System.out.println("Букет простоит " + minLifeSpan + " суток");
    }

    public static void
}
