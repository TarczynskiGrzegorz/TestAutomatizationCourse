package homework.h20240822.interfaces;

public interface Resetable {
    default void reset(){
        System.out.println("reseting device");
    }
}
