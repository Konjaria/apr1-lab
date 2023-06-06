/**ამ მანქანებს ჰქონდეთ დამატებითი ველი: მოდელი*/
public class Mercedes extends Car{
    String CarModel;

    public Mercedes(double speed, double weight, String carModel) {
        super(speed, weight);
        CarModel = carModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "CarModel='" + CarModel + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
