/**ამ მანქანებს ჰქონდეთ დამატებითი ველი: მოდელი*/
public class Porsche extends Car {
    String CarModel;

    public Porsche(double speed, double weight, String carModel) {
        super(speed, weight);
        CarModel = carModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "CarModel='" + CarModel + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
