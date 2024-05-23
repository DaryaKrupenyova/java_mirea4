package prac2_package;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class HumanTest {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(19, "Pavel", "Vishnyakov",
                LocalDate.of(1980, Month.JULY, 4), 90));
        humans.add(new Human(20, "Darya", "Krupenyova",
                LocalDate.of(1999, Month.DECEMBER, 26), 70));
        humans.add(new Human(19, "Denis", "Vorobyov",
                LocalDate.of(2004, Month.DECEMBER, 9), 85));

        Stream<Human> humanStream = humans.stream();

        int result = humanStream.map(h -> {
            Human nh = new Human(h);
            nh.setWeight(h.getWeight() + 3);
            return nh;
        }).
                sorted(Comparator.comparingInt(Human::getWeight).reversed()).
                filter(human -> human.getDateOfBirth().isBefore(LocalDate.of(2000, 1, 1))).
                mapToInt(Human::getWeight).sum();
        System.out.println(result);
    }
}
