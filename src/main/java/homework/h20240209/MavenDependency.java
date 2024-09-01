package homework.h20240209;

import com.google.common.collect.Lists;

import java.util.List;

public class MavenDependency {
    public static void main(String[] args) {
        // Google guava library
        List<String> names = Lists.newArrayList("Alex","Ivan","Peter","John");
        List<String> reversed = Lists.reverse(names);
        System.out.println(reversed);


    }
}
