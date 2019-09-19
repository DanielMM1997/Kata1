package kata1;

import java.util.Date;


public class Person {

    private final String name;
    private final Date birthday;
    private final int MILISECONDS_PER_SECONDS = 1000;
    private final int SECONDS_PER_MINUTES = 60;
    private final int MINUTES_PER_HOURS = 60; 
    private final int HOURS_PER_DAYS = 24;
    private final float DAYS_PER_YEARS = 365.25f;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime() - birthday.getTime()) / milisecondsPerYears());
    }

    private float milisecondsPerYears() {
        return MILISECONDS_PER_SECONDS * SECONDS_PER_MINUTES *
                MINUTES_PER_HOURS * HOURS_PER_DAYS *
                DAYS_PER_YEARS;
    }
    
    
}
