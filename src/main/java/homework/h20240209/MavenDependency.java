package homework.h20240209;

import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MavenDependency {
    private static final Logger log = LogManager.getLogger(MavenDependency.class);

    public static void main(String[] args) {
        // Google guava library
        List<String> names = Lists.newArrayList("Alex", "Ivan", "Peter", "John");
        List<String> reversed = Lists.reverse(names);
        System.out.println(reversed);

        //log4j
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
        log.fatal("Fatal");
    }
}
