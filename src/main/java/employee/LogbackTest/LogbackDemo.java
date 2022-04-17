package main.java.employee.LogbackTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
    public static final Logger LOGGER = LoggerFactory.getLogger("LogbackDemo.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("debug级日志");
            LOGGER.info("info级日志");
            int a = 10;
            int b = 0;
            int c = a/b;
            LOGGER.trace("a = " + a);
            LOGGER.trace("b = " + b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("error级日志：" + e);
        }

    }
}
