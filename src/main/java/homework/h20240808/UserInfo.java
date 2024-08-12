package homework.h20240808;

public class UserInfo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No info about user provided. Insert arguments during running program e.g. java UserInfo param1 param2 123 ");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("User info no." + i + ": " + args[i]);
            }
        }

    }
}
