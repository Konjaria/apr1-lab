/**ამ მანქანებს ჰქონდეთ დამატებითი ველი: მოდელი*/
public class BMW extends Car {
    String CarModel;

    public BMW(double speed, double weight, String model){
        // set user-defined values for explicit constructor idea
        super(speed, weight);
        this.CarModel = model;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "CarModel='" + CarModel + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
