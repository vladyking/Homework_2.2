package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final String productionCountry;
    private final int productionYear;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTyres;
    private Key key;
    private Insuranse insuranse;

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

    public Car(String brand, String model, double engineVolume, String color,
               String productionCountry, int productionYear, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats,
               boolean summerTyres, Key key, Insuranse insuranse) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "Информация не указана";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Информация не указана";
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        this.summerTyres = true;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insuranse == null) {
            this.insuranse = new Insuranse();
        } else {
            this.insuranse = insuranse;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
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
        this.key = key;
    }

    public Insuranse getInsuranse() {
        return insuranse;
    }

    public void setInsuranse(Insurance insuranse) {
        this.insuranse = insuranse;
    }


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
    public String toString() {
        return brand + " " + model + " " + engineVolume + " " + color + " " +
                productionCountry + " " + productionYear + " " + transmission + " " +
                bodyType + " " + registrationNumber + " " + numberOfSeats + " " + summerTyres
                + " " + getKey() + " " + getInsuranse();
    }
}