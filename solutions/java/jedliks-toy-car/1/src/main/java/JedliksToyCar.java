public class JedliksToyCar {

    private int distance = 0 ;
    private int batteryPercentance  =100;

    public static JedliksToyCar buy() {
       return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+ distance +" meters";
    }

    public String batteryDisplay() {
         return   batteryPercentance >= 1 ? "Battery at "+batteryPercentance+"%" : "Battery empty";
    }

    public void drive() {

         batteryPercentance -= 1;
        if (batteryPercentance >=0 ) distance += 20; 
        
    }
}
