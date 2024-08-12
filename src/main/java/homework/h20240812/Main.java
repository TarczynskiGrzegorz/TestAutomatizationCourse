package homework.h20240812;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera(2048, 3, false);

        Display display = new Display(600, "AMOLED", 2048);

        Model iphone15 = new Model("Iphone 15",128, "IOS 5", display, camera);

        Phone phone1 = new Phone();
        phone1.setColor("black");
        phone1.setModel(iphone15);
        phone1.setPrize(1999.99);

        User user = new User("Jan");
        user.addPhone(phone1);

        System.out.println(user.toString());


    }


}
