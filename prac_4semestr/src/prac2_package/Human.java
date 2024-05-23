package prac2_package;
import java.lang.*;
import java.time.LocalDate;

public class Human {
    int age;
    String firstname;
    String lastname;
    LocalDate birthDate;
    int weight;

    Human(int age, String firstname, String lastname, LocalDate birthDate, int weight){
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    Human(Human h) {
        this.age = h.age;
        this.firstname = h.firstname;
        this.lastname = h.lastname;
        this.birthDate = h.birthDate;
        this.weight = h.weight;
    }

    public int getWeight(){
        return weight;
    }

    public LocalDate getDateOfBirth(){
        return birthDate;
    }

    public void setWeight(int w){
        this.weight = w;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }
}
