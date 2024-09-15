package homework.h20240822_20240916;

import homework.h20240209.MavenDependency;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

public class Main20240916_Reflection_Stream {
    private static final Logger log = LogManager.getLogger(MavenDependency.class);

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //------------------streams from User class
        try {
            Phone p1 = new LandlinePhone(1234567);
            p1.setPrize(100);
            Phone p2 = new LandlinePhone(1234567);
            p2.setPrize(200);
            Phone p3 = new Smartphone(123456790);
            p3.setPrize(1000);
            Phone p4 = new Smartphone(123456790);
            p4.setPrize(2000);
            Phone p5 = new Smartphone();
            p4.setPrize(2000);

            User u1 = new User();
            u1.addPhone(p1);
            u1.addPhone(p2);
            u1.addPhone(p3);
            u1.addPhone(p4);
            u1.addPhone(p5);

            u1.getLandlinePhones().stream().forEach(v -> log.error(v.getClass()));
            u1.getSmartphones().stream().forEach(v -> log.error(v.getClass()));

            u1.printPhonesNumber();
            log.error(u1.getPrizes());
            log.error(u1.getPrizesOfSmartphones());
            log.error(u1.getPrizesOfLandlinePhones());

            u1.setName("Ala");
            User u2 = new User("Olo");
            User u3 = new User("Andrej");

            List<User> users = Arrays.asList(u1, u2, u3);
            users.stream().map(User::getName)
                    .filter(v -> !v.isEmpty())
                    .sorted()
                    .forEach(log::error);

            log.error(u1.getPhonesWithoutNumbers());

        } catch (Exception e) {
            log.error(e.getMessage());
        }


        //-------------------REFLECTION
        log.error("Constructors");
        Class p1 = LandlinePhone.class;
        Constructor[] constructors = p1.getConstructors();
        Arrays.stream(constructors).forEach(v -> {
            Parameter[] parameters = v.getParameters();
            Arrays.stream(parameters).forEach(p -> {
                log.error(p.getName() + " - " + p.getType());
            });
        });

        log.error("Fields");
        Field[] fields = p1.getDeclaredFields();
        Arrays.stream(fields).forEach(v -> {
            log.error(v.getName() + ": " + v.getType() + ", " + Modifier.toString(v.getModifiers()));
        });


        log.error("Methods");
        Method[] methods = p1.getDeclaredMethods();
        Arrays.stream(methods).forEach(v -> {
            log.error(v.getName() + ": " + Modifier.toString(v.getModifiers()) + ", " + Arrays.toString(v.getParameters()));
        });

        // invoke method from reflection

        Constructor constructor = p1.getConstructor();
        LandlinePhone p2 = (LandlinePhone) constructor.newInstance();
        Method method1 = p1.getMethod("setVeryOld", boolean.class);
        method1.invoke(p2, true);

        Method method2 = p1.getMethod("isVeryOld");
        method2.invoke(p2);
        log.error(method2.invoke(p2));


    }
}
