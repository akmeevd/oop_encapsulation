import transport.Car;

public class Main {
    public static void main(String[] args) {

        //Дз 1 задание 1
        Human human = new Human("Иван", "Минск", 35, "бренд-менеджер");
        Human human1 = new Human(null, "Москва", 29, "методист образовательных программ");
        Human human2 = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human human3 = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");
        System.out.println(human);
        Human human4 = new Human("Владимир", "Казань", 21, "не работаю");
        System.out.println(human4);
        human4.setYearOfBirth(-1);
        System.out.println(human);

        //ДЗ 1 задание 2


        Flower flower = new Flower("Роза обыкновенная", "Голландния", 35.59, null);
        Flower flower1 = new Flower("Хризантема", null, 15, 5);
        Flower flower2 = new Flower("Пион", "Англия", 69.9, 1);
        Flower flower3 = new Flower("Гипсофила", "Турция", 19.5, 10);
        System.out.println(flower);
        Flower.calculateCostOfFlowers(flower2, 3, flower2, 4, flower3, 2, flower1, 3);

        //Дз2 и 3
        Car.Insurance insurance = new Car.Insurance(1, 20_000, "123456789");

        Car car = new Car("BMW", "X5", 3.0, "черный", 2020,
                "Германия", "автомат", "Седан", "b000px000",
                4, "летние", insurance);


    }
}