package com.lingner.people;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingProperty {

    private static Logger logger = Logger.getLogger(LoggingProperty.class);

    public static void main(String[] args){

        PropertyConfigurator.configure("src/log4j.properties");
        logger.info("Log4j appender configuration is succesful!");
        logger.trace("This is a trace message");
        logger.debug("This is a debug message");
        logger.error("This is an error message");
    }
}
