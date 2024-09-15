package homework.h20240822_20240916.interfaces;

public interface Sendable {
    void sendMessage();

    default void sendEmail() {
        System.out.println("Device sends an Email");
    }
}
