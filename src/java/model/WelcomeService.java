
package model;

import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author joshuabrown
 */
public class WelcomeService {
    
    private String timeOfDayGreeting;
    
    
    private String timeOfDay(){
        LocalTime currentTime = LocalTime.now();
        int time = currentTime.getHour();
        
        if(time >=1 && time <=11){
            timeOfDayGreeting="morning";
            
        }else if(time >= 12 && time <= 17 ){
            timeOfDayGreeting = "afternoon";
    }else if(time >=18 && time <=24){
            timeOfDayGreeting = "evening";
            
        }
        return timeOfDayGreeting;
        
    }
    
    
    public String greeting(String name){
        timeOfDay();
        
        return "Good " + timeOfDayGreeting +", "+name+". Welcome!";
        
        
    }

    public String getTimeOfDayGreeting() {
        return timeOfDayGreeting;
    }

    public void setTimeOfDayGreeting(String timeOfDayGreeting) {
        this.timeOfDayGreeting = timeOfDayGreeting;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.timeOfDayGreeting);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WelcomeService other = (WelcomeService) obj;
        if (!Objects.equals(this.timeOfDayGreeting, other.timeOfDayGreeting)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
    
    
    
    
}
