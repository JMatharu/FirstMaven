package org.jmatharu.maven;

import org.slf4j.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //using Logger Oblect of slf4j
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello world !!");
    }
}
