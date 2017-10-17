package log;

/**
 * Created by xavi on 17/10/17.
 */
public class LogFileManager implements LogManager {

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

    }

    public void error(String text) {

    }

    public void debug(String text) {

    }

    public void warning(String text) {

    }
}
