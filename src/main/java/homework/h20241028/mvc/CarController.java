package homework.h20241028.mvc;

public class CarController {
    private Car carModel;
    private CarView carView;

    public CarController(Car car, CarView carView) {
        this.carModel = car;
        this.carView = carView;
    }
    public void setCarName(String name){
        carModel.setName(name);
    }
    public String getCarName(){
        return carModel.getName();
    }
    public void setCarPrize(int prize){
        carModel.setPrize(prize);
    }
    public int getCarPrize(){
        return carModel.getPrize();
    }
    public void updateView(){
        carView.printInfo(carModel.getName(), carModel.getPrize());
    }
}
