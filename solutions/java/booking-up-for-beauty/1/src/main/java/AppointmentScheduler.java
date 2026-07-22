import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
         //7/25/2019 13:45:00   format
         DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");

       return    LocalDateTime.parse(appointmentDateDescription, dateTimeFormatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalTime localTime = appointmentDate.toLocalTime(); // to get the local time 
        
        int hour = localTime.getHour(); // to get the hour 
         return hour >= 12 && hour < 18 ? true : false;

    }

    public String getDescription(LocalDateTime appointmentDate) {

        String rawday = appointmentDate.getDayOfWeek().name();
        String  rawmonth  = appointmentDate.getMonth().name();

        String dayName = rawday.substring(0,1).toUpperCase() + rawday.substring(1).toLowerCase();
        String monthName = rawmonth.substring(0,1).toUpperCase() + rawmonth.substring(1).toLowerCase();
        int day = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear();

        DateTimeFormatter  timeFormatter =  DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
        String formatedTime = appointmentDate.format(timeFormatter);

         return  String.format("You have an appointment on %s, %s %d, %d, at %s.", dayName,monthName,day,year,formatedTime);
    }

    public LocalDate getAnniversaryDate() {
       return LocalDate.of(LocalDateTime.now().getYear(), 9, 15);
    }
}
