package Task_1;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание №1:");

        Human maxim = new Human();
        maxim.yearOfBirth = 1987;
        maxim.name = "Максим";
        maxim.town = "Минск";

        Human anya = new Human();
        anya.yearOfBirth = 1993;
        anya.name = "Аня";
        anya.town = "Москва";

        Human katya = new Human();
        katya.yearOfBirth = 1994;
        katya.name = "Катя";
        katya.town = "Калининград";

        Human artem = new Human();
        artem.yearOfBirth = 1995;
        artem.name = "Артем";
        artem.town = "Москва";

        System.out.println("Привет!" +
                " Меня зовут " + maxim.name + ". Я из города " + maxim.town +
                ". Я родился в " + maxim.yearOfBirth + " году. Будем знакомы!");

        System.out.println("Привет!" +
                " Меня зовут " + anya.name + ". Я из города " + anya.town +
                ". Я родился в " + anya.yearOfBirth + " году. Будем знакомы!");

        System.out.println("Привет!" +
                " Меня зовут " + katya.name + ". Я из города " + katya.town +
                ". Я родился в " + katya.yearOfBirth + " году. Будем знакомы!");

        System.out.println("Привет!" +
                " Меня зовут " + artem.name + ". Я из города " + artem.town +
                ". Я родился в " + artem.yearOfBirth + " году. Будем знакомы!");

        //Task 2
        System.out.println("Задание №2:");

        int thisYear = 2022;

        maxim.jobTitle = "бренд-менеджер";
        anya.jobTitle = "методист образовательных программ";
        katya.jobTitle = "продакт-менеджер";
        artem.jobTitle = "директор по развитию бизнеса";

        System.out.println("Привет!" +
                " Меня зовут " + maxim.name + ". Я из города " + maxim.town +
                ". Мне " + (thisYear - maxim.yearOfBirth) + " лет. Я работаю на должности " + maxim.jobTitle +
                ". Будем знакомы!");

        System.out.println("Привет!" +
                " Меня зовут " + anya.name + ". Я из города " + maxim.town +
                ". Мне " + (thisYear - anya.yearOfBirth) + " лет. Я работаю на должности " + anya.jobTitle +
                ". Будем знакомы!");

        System.out.println("Привет!" +
                " Меня зовут " + katya.name + ". Я из города " + maxim.town +
                ". Мне " + (thisYear - katya.yearOfBirth) + " лет. Я работаю на должности " + katya.jobTitle +
                ". Будем знакомы!");

        System.out.println("Привет!" +
                " Меня зовут " + artem.name + ". Я из города " + artem.town +
                ". Мне " + (thisYear - artem.yearOfBirth) + " лет. Я работаю на должности " + artem.jobTitle +
                ". Будем знакомы!");

        //Task 3
        System.out.println("Задание №3:");

        Car lada_Granta = new Car();
        lada_Granta.brand = "lada";
        lada_Granta.model = "Granta";
        lada_Granta.engineVolume = 1.7;
        lada_Granta.color = "Yellow";
        lada_Granta.productionCountry = "Russia";
        lada_Granta.productionYear = 2015;

        Car audi_A8_50_L_TDI_Quattro = new Car();
        audi_A8_50_L_TDI_Quattro.brand = "Audi";
        audi_A8_50_L_TDI_Quattro.model = "A8_50_L_TDI_Quattro";
        audi_A8_50_L_TDI_Quattro.engineVolume = 3.0;
        audi_A8_50_L_TDI_Quattro.color = "Black";
        audi_A8_50_L_TDI_Quattro.productionCountry = "Germany";
        audi_A8_50_L_TDI_Quattro.productionYear = 2020;

        Car bmw_Z8 = new Car();
        bmw_Z8.brand = "BMW";
        bmw_Z8.model = "Z8";
        bmw_Z8.engineVolume = 3.0;
        bmw_Z8.color = "Black";
        bmw_Z8.productionCountry = "Germany";
        bmw_Z8.productionYear = 2021;

        Car kiaSportage4 = new Car();
        kiaSportage4.brand = "KIA";
        kiaSportage4.model = "Sportage4";
        kiaSportage4.engineVolume = 2.4;
        kiaSportage4.color = "Red";
        kiaSportage4.productionCountry = "South Korea";
        kiaSportage4.productionYear = 2018;

        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.color = "Orange";
        hyundaiAvante.productionCountry = "South Korea";
        hyundaiAvante.productionYear = 2016;

        System.out.println(lada_Granta.brand + " " +
                lada_Granta.model + " " +
                lada_Granta.engineVolume + " " +
                lada_Granta.color + " " +
                lada_Granta.productionCountry + " " +
                lada_Granta.productionYear);

        System.out.println(audi_A8_50_L_TDI_Quattro.brand + " " +
                audi_A8_50_L_TDI_Quattro.model + " " +
                audi_A8_50_L_TDI_Quattro.engineVolume + " " +
                audi_A8_50_L_TDI_Quattro.color + " " +
                audi_A8_50_L_TDI_Quattro.productionCountry + " " +
                audi_A8_50_L_TDI_Quattro.productionYear);

        System.out.println(bmw_Z8.brand + " " +
                bmw_Z8.model + " " +
                bmw_Z8.engineVolume + " " +
                bmw_Z8.color + " " +
                bmw_Z8.productionCountry + " " +
                bmw_Z8.productionYear);

        System.out.println(kiaSportage4.brand + " " +
                kiaSportage4.model + " " +
                kiaSportage4.engineVolume + " " +
                kiaSportage4.color + " " +
                kiaSportage4.productionCountry + " " +
                kiaSportage4.productionYear);

        System.out.println(hyundaiAvante.brand + " " +
                hyundaiAvante.model + " " +
                hyundaiAvante.engineVolume + " " +
                hyundaiAvante.color + " " +
                hyundaiAvante.productionCountry + " " +
                hyundaiAvante.productionYear);
    }

}
