package Task_2_3;

public class Main {

    public static void main(String[] args) {

        Human maxim = new Human(1987, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(1994, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");

        System.out.println("Задание №1:");
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);

        System.out.println("Задание №2:");
        Car lada_Granta = new Car("lada", "Granta", 1.7, "Yellow", "Russia", 2015);
        Car audi_A8_50_L_TDI_Quattro = new Car("Audi", "A8_50_L_TDI_Quattro", 3.0, "Black", "Germany", 2020);
        Car bmw_Z8 = new Car("BMW", "Z8", 3.0, "Black", "Germany", 2021);
        Car kiaSportage4 = new Car("KIA", "Sportage4", 2.4, "Red", "South Korea", 2018);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Orange", "South Korea", 2016);

        System.out.println(lada_Granta);
        System.out.println(audi_A8_50_L_TDI_Quattro);
        System.out.println(bmw_Z8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);
    }

}
