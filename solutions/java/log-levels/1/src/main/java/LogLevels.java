public class LogLevels {
    
    public static String message(String logLine) {
      String[]  level = logLine.trim().split(":");  
      return level[1].trim();
    }

    public static String logLevel(String logLine) {
       String[] level = logLine.trim().split(":");
       String formatedData =level[0].toLowerCase().trim();
       return formatedData.replaceAll("[\\[\\]]", "");
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+ logLevel(logLine)+")";
    }
}
