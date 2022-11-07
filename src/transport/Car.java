package transport;

import java.time.LocalDate;

public class Car extends Transport {
    //region fields (...)
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    //endregion
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessEntry=" + keylessEntry +
                    '}';
        }
    }

    public static class Insurance {
        private final LocalDate endDateInsurance;
        private final double costInsurance;
        private final String numberInsurance;

        public Insurance(LocalDate endDateInsurance, double costInsurance, String numberInsurance) {
            if (endDateInsurance == null) {
                this.endDateInsurance = LocalDate.now().plusDays(365);
            } else {
                this.endDateInsurance = endDateInsurance;
            }

            if (Double.compare(costInsurance, 0) == 0) {
                this.costInsurance = 10000.00;
            } else {
                this.costInsurance = costInsurance;
            }

            if (numberInsurance == null || numberInsurance.isEmpty() || numberInsurance.isBlank()) {
                this.numberInsurance = "ABC123456";
            } else {
                this.numberInsurance = numberInsurance;
            }
        }

        public Insurance() {
            this(null, 10000.00, null);
        }

        public LocalDate getEndDateInsurance() {
            return endDateInsurance;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public void checkEndDateInsurance() {
            if (endDateInsurance.isBefore(LocalDate.now()) ||
                    endDateInsurance.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

    }

    //region Constructor {...}
    public Car(String brand, String model, int productionYear, String productionCountry,
               String color, Float maxSpeed, String fuel, double engineVolume,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats,
               boolean summerTyres, Key key, Insurance insurance) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuel);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.summerTyres = summerTyres;
        this.key = key;
        this.insurance = insurance;
        this.summerTyres = true;
    }
    //endregion

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "Информация не указана";
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "Информация не указана";
        } else {
            this.bodyType = bodyType;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }
    //endregion

    //Проверка правильности написания номера авто (x000xx000)
    public boolean checkRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] symbols = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(symbols[0]) ||
                !Character.isAlphabetic(symbols[4]) ||
                !Character.isAlphabetic(symbols[5])) {
            return false;
        }
        if (!Character.isDigit(symbols[1]) || !Character.isDigit(symbols[2]) || !Character.isDigit(symbols[3]) ||
                !Character.isDigit(symbols[6]) || !Character.isDigit(symbols[7]) || !Character.isDigit(symbols[8])) {
            return false;
        }
        return true;
    }

    public void checkNumberInsurance() {
        if (registrationNumber.length() != 9) {
            System.out.println("Номер страховки некорректный!");
        }
    }

    @Override
    public void refill() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " Заправить топливом " + getFuel());
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() + "." + " Модель " + getModel() + "." +
                " Год производства " + getProductionYear() + "." + " Страна производства " + getProductionCountry() + "." +
                " Цвет авто " + getColor() + "." + " Максимальная скорость " + getMaxSpeed() + "." +
                " Тип топлива " + getFuel() + "." + " Объем двигателя " + engineVolume + "." +
                " Тип трансмиссии " + transmission + "." + " Тип кузова " + bodyType + "." +
                " Регистрационный номер " + registrationNumber + "." + " Количество мест " + numberOfSeats + "." +
                " Летние шины " + summerTyres + "." +
                " Ключ " + getKey().keylessEntry + " " + getKey().remoteEngineStart + "." +
                " Страховка " + getInsurance().endDateInsurance + " " + getInsurance().costInsurance + " " +
                getInsurance().numberInsurance + ".";
    }
}