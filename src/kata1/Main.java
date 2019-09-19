package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(2000, 1, 24);

        Person person = new Person("Juan", date);
        System.out.println(person.getName() + " tiene " + person.getAge() 
                            + " años.");
    }
}