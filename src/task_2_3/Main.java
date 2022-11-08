package task_2_3;

import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {

    public static void main(String[] args) {
        //region Human (...)
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
        //endregion
        //region Car (...)
        System.out.println("Задание №2.3 (Инкапсуляция + Наследование):");

        Car ladaGranta = new Car("lada", "Granta", 2015,
                "Russia", "Yellow", 180.00f,
                "бензин", 1.6, "МКПП",
                "Sedan", "a111aa999", 5,
                true, new Car.Key(), new Car.Insurance());

        Car audiA8L50TDIQuattro = new Car("Audi", "A8 L 50 TDI Quattro", 2020,
                "Germany", "Black", 220.00f,
                "дизель", 3.0, "АКПП",
                "Sedan", "b222bb888", 5,
                true, new Car.Key(), new Car.Insurance());


        Car bmwZ8 = new Car("BMW", "Z8", 2003,
                "Germany", "Black", 250.00f,
                "бензин", 4.9, "АКПП",
                "Roadster", "c333cc777", 2,
                true, new Car.Key(), new Car.Insurance());

        Car kiaSportage4 = new Car("KIA", "Sportage4", 2018,
                "South Korea", "Red", 210.00f,
                "бензин", 2.4, "АКПП",
                "Сrossover", "d444dd666", 5,
                false, new Car.Key(), new Car.Insurance());

        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016,
                "South Korea", "Orange", 190.00f,
                "бензин", 1.6, "АКПП",
                "Sedan", "e555ee555", 5,
                false, new Car.Key(), new Car.Insurance());

        System.out.println(ladaGranta);
        System.out.println(audiA8L50TDIQuattro);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);
        System.out.println();

        ladaGranta.setRegistrationNumber("a111aa999");
        System.out.println("Проверка правильности написания номера авто. Номер введен корректно(true)/некорректно(false) - " + ladaGranta.checkRegNumber());
        System.out.println();

        System.out.println("Задание №2.3 (Абстракция):");
        ladaGranta.refill();
        audiA8L50TDIQuattro.refill();
        bmwZ8.refill();
        kiaSportage4.refill();
        hyundaiAvante.refill();
        System.out.println();
        //endregion
        //region Flowers (...)
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
        System.out.println();

        double checkPriceBouquet = ((roza.getCost() * 3) + (chrysanthemum.getCost() * 5) + (gypsophila.getCost())) * 1.10;
        System.out.printf("Подсчет стоимости букета (проверка) %s%n", String.format("%.2f", checkPriceBouquet) + " рублей");

        System.out.println();
        //endregion
        //region Train (...)
        System.out.println("Класс Train Наследование:");
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
                301.00f, "Белорусский вокзал", "Минск-Пассажирский",
                3500.00, 11, "дизель");
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                270.00f, "Ленинградский вокзал", "Ленинград-Пассажирский",
                1700.00, 8, "дизель");

        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println();

        System.out.println("Задание №2.3 (Абстракция):");
        lastochka.refill();
        leningrad.refill();
        System.out.println();
        //endregion
        //region Bus (...)
        System.out.println("Класс Bus Наследование:");
        Bus liaz = new Bus("ЛИАЗ", "4292", 2015, "Россия",
                "Синий", 85.0f, "Дизель");
        Bus paz = new Bus("ПАЗ", "4234", 2020, "Россия",
                "Белый", 95.0f, "Дизель");

        System.out.println(liaz);
        System.out.println(paz);
        System.out.println();

        System.out.println("Задание №2.3 (Абстракция):");
        liaz.refill();
        paz.refill();
        System.out.println();
        //endregion
    }

    //region calculateCostBouquet (...)
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

    //endregion
    //region calculateMinStandTime (...)
    private static void calculateMinStandTime(Flower... flowers) {
        int minLifeSpan = Integer.MAX_VALUE;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null && flowers[i].lifeSpan < minLifeSpan) {
                minLifeSpan = flowers[i].lifeSpan;
            }
        }
        System.out.println("Букет простоит " + minLifeSpan + " суток");
    }
    //endregion
}
