package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {

    private final String name;
    private final Calendar birthday;
    private final long MILLISECONDS_PER_YERAS = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milisecondsToYears(today.getTimeInMillis() - 
                        birthday.getTimeInMillis()));
    }
    
    private long milisecondsToYears(long millis){
        return millis/MILLISECONDS_PER_YERAS;
    }
}
