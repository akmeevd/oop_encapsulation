import java.time.LocalDate;
import java.util.Objects;

public class Human {

    private String town;
    private Integer yearOfBirth;

    private String name;
    private String job;


    public Human(String name,String town, Integer age, String job) {
        this.town = Objects.requireNonNullElse(town, "Информация не указана");
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        this.job = Objects.requireNonNullElse(job, "Информация не указана");

        if (age == null || age < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        }
    }


    public String getTown() {
        return town;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth == null || yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(ась) в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
