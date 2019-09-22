package kata1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1997, 8, 27);
        Person person = new Person("Juan", date);
        System.out.println(person.getName() + " tiene " + person.getAge() 
                            + " años.");
    }
}