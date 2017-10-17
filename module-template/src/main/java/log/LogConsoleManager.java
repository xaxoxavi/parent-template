package log;

/**
 * Created by xavi on 17/10/17.
 */
public class LogConsoleManager implements LogManager {

    private boolean isInfo;
    private boolean isDebug;
    private boolean isError;
    private boolean isWarning;


    public void setInfo(boolean info) {
        isInfo = info;
    }

    public void setDebug(boolean debug) {
        isDebug = debug;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public void setWarning(boolean warning) {
        isWarning = warning;
    }

    public void info(String text) {
        if (isInfo) printLogWithLevel(LogLevel.INFO,text);
    }


    public void error(String text) {
        if (isError) printLogWithLevel(LogLevel.ERROR,text);
    }

    public void debug(String text) {
        if (isDebug) printLogWithLevel(LogLevel.DEBUG,text);

    }

    public void warning(String text) {
        if (isWarning) printLogWithLevel(LogLevel.WARN, text);
    }

    private void printLogWithLevel(LogLevel level, String text) {
        System.out.println(level.toString() + ": " + text);
    }



}
