package transport;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private String colour;
    private Integer productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String regisrtrationNumber;
    private Integer seats;
    private String tyreType;
    private Insurance insurance;

    public static class Key {

        private String remoteStartOfEngine;
        private String keyLessAccess;

        public Key(String remoteStartOfEngine, String keyLessAccess) {
            this.remoteStartOfEngine = Objects.requireNonNullElse(remoteStartOfEngine, "Информация не указана");
            this.keyLessAccess = Objects.requireNonNullElse(keyLessAccess, "Информация не указана");
        }

        public String getRemoteStartOfEngine() {
            return remoteStartOfEngine;
        }

        public String getKeyLessAccess() {
            return keyLessAccess;
        }
    }

    public static class Insurance {
        private Integer insuranceValidityPeriod;
        private Integer costInsurance;
        private String numberInsurance;

        public Integer getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }

        public Integer getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }


        @Override
        public String toString() {
            return "Insurance{" +
                    "insuranceValidityPeriod=" + insuranceValidityPeriod +
                    ", costInsurance=" + costInsurance +
                    ", numberInsurance='" + numberInsurance + '\'' +
                    '}';
        }

        public Insurance(Integer insuranceValidityPeriod, Integer costInsurance, String numberInsurance) {
            if (costInsurance == null || costInsurance < 0) {
                this.costInsurance = 0;
            } else {
                this.costInsurance = costInsurance;
            }
            if (numberInsurance == null || numberInsurance.isEmpty() || numberInsurance.isBlank()) {
                this.numberInsurance = "Инфо нет";
            } else if (numberInsurance.length() != 9) {
                this.numberInsurance = "Номер некорректный";
            } else {
                this.numberInsurance = numberInsurance;
            }
            if (insuranceValidityPeriod != null) {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            } else if (insuranceValidityPeriod == 0) {
                System.out.println("Поменяйте страховку");
            } else if (insuranceValidityPeriod < 0) {
                System.out.println("Некорректно");
            }




        }

    }


    public Car(String brand, String model, Double engineVolume, String colour,
               Integer productionYear, String productionCountry, String transmission, String bodyType,
               String regisrtrationNumber, Integer seats, String tyreType, Insurance insurance) {
        this.brand = Objects.requireNonNullElse(brand, "Информация не указана");
        this.model = Objects.requireNonNullElse(model, "Информация не указана");
        if (engineVolume != null) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 0.0;
        }
        this.colour = Objects.requireNonNullElse(colour, "Информация не указана");
        if (productionYear != null) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 1990;
        }
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "Информация не указана");
        this.transmission = Objects.requireNonNullElse(transmission, "Информация не указана");
        this.bodyType = Objects.requireNonNullElse(bodyType, "Информация не указана");
        String numbers = "1234567890";
        if (numbers.contains(regisrtrationNumber.substring(0, 1)) ||
                numbers.contains(regisrtrationNumber.substring(4, 5)) || numbers.contains(regisrtrationNumber.substring(5, 6))) {
            throw new RuntimeException("Не верно");
        }
        if (numbers.contains(regisrtrationNumber.substring(1, 2)) &&
                numbers.contains(regisrtrationNumber.substring(2, 3))
                && numbers.contains(regisrtrationNumber.substring(3, 4)) &&
                numbers.contains(regisrtrationNumber.substring(6, 7))
                && numbers.contains(regisrtrationNumber.substring(7, 8)) &&
                numbers.contains(regisrtrationNumber.substring(8)) && regisrtrationNumber.length() == 9) {
            this.regisrtrationNumber = regisrtrationNumber;
        } else {
            throw new RuntimeException("Не верно");
        }

        if (seats != null) {
            this.seats = seats;
        } else {
            this.seats = 4;
        }
        this.tyreType = Objects.requireNonNullElse(tyreType, "Информация не указана");

        if (insurance != null) {
            this.insurance = insurance;
        }
    }

    public void changeTyre() {
        if (getTyreType().equalsIgnoreCase("зимние")) {
            setTyreType("летние");
        } else if (getTyreType().equalsIgnoreCase("летние")) {
            setTyreType("зимние");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColour() {
        return colour;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegisrtrationNumber() {
        return regisrtrationNumber;
    }

    public Integer getSeats() {
        return seats;
    }

    public String getTyreType() {
        return tyreType;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegisrtrationNumber(String regisrtrationNumber) {
        this.regisrtrationNumber = regisrtrationNumber;
    }

    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", colour='" + colour + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regisrtrationNumber='" + regisrtrationNumber + '\'' +
                ", seats='" + seats + '\'' +
                ", tyreType='" + tyreType + '\'' + " " + insurance +
                '}';
    }
}
