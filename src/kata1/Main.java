package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Juan", new Date(95, 5, 20));
        System.out.println(person.getName() + " tiene " + person.getAge() 
                            + " años.");
    }
    
}
