import java.util.Objects;

public class Flower {

    private String flowerColor;
    private String country;
    private double cost;
    Integer lifeSpan;


    public Flower(String flowerColor, String country, double cost, Integer lifeSpan) {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost == 0 || cost < 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan == null || lifeSpan < 0) {
            this.lifeSpan = 0;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public static void calculateCostOfFlowers(Flower flower, int count, Flower flower2, int count2, Flower flower3
            , int count3, Flower flower4, int count4) {
        double sum;
        double percentForWorkOfFlorist = 10;
        int minLifeSpan;
        minLifeSpan = Math.min(flower.lifeSpan, flower2.lifeSpan);
        minLifeSpan = Math.min(minLifeSpan, flower3.lifeSpan);
        minLifeSpan = Math.min(minLifeSpan, flower4.lifeSpan);
        if (flower == null) {
            flower.setCost(0);
            count = 0;
        } if (flower2 == null) {
            flower2.setCost(0);
            count2 = 0;
        } if (flower3 == null) {
            flower3.setCost(0);
            count3 = 0;
        } if (flower4 == null) {
            flower4.setCost(0);
            count4 = 0;
        }

        sum = (flower.getCost() * count + flower2.getCost() * count2 + flower3.getCost() * count3 +
                flower4.getCost() * count4) * (percentForWorkOfFlorist + 100) / 100 ;
        String sum1 = String.format("%.2f", sum);
        System.out.println(flower.getFlowerColor() + " - " + count + " шт." + flower2.getFlowerColor() + " - " + count2 + " шт." +
                flower3.getFlowerColor() + " - " + count3 + " шт." + flower4.getFlowerColor() + " - " + count4 + " шт." +
                "Сумма букета - " + sum1 + ". " + "Срок стояния букета - " + minLifeSpan);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
