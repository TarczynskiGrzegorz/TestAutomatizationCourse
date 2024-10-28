package homework.h20241028.facade;

public class Facade {
    private Element1 e1;
    private Element2 e2;
    public Facade() {
        this.e1 = new Element1();
        this.e2 = new Element2();
    }

    public void start(){
        method1();
        method2();
    }
    public void method1(){
        this.e1.method1(); }
    public void method2(){
        this.e2.method2(); }

}
