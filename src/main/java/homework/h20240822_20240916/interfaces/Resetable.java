package homework.h20240822_20240916.interfaces;

public interface Resetable {
    default void reset() {
        System.out.println("reseting device");
    }
}
