public class LogLine {
    
    LogLevel currentLogLevel;
    private  final String[] splited;
    
    public LogLine(String logLine) {

        this.splited = logLine.split(":");

        String keyWord = splited[0].replaceAll("[\\[\\]]", "");

        switch ( keyWord) {
            case "TRC":
                currentLogLevel = LogLevel.TRACE;
                break;
            case "DBG":
                currentLogLevel = LogLevel.DEBUG;
                break;
            case "ERR":
                currentLogLevel =  LogLevel.ERROR;
                break;
            case "FTL":
                currentLogLevel = LogLevel.FATAL;
                break;
            case "INF":
                currentLogLevel = LogLevel.INFO;
                break;
            case "WRN":
                currentLogLevel = LogLevel.WARNING;
                break;
            default:
                currentLogLevel = LogLevel.UNKNOWN;
                break;
        }


    }

    public LogLevel getLogLevel() {
       return currentLogLevel;
    }

    public String getOutputForShortLog() {
        return currentLogLevel.getLogLevel() + ":"+this.splited[1].trim();
    }
}
