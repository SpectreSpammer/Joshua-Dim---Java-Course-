package day9_exceptions.logger;

import org.apache.poi.ss.formula.functions.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MainLogger.class.getName());

        logger.severe("This is a severe error message");
        logger.warning("This is a warning message");
        logger.info("This is a informational message");


        String username = "joshua";
        int age = 29;

        logger.log(Level.INFO,"Username:{0} and Age:{1}", new Object[]{username,age});

    }
}
