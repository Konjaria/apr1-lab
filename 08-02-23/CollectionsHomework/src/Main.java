import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Car> demo = new ArrayList<>();
        for(int i =0; i < 60; i++){
            BMW x_piat = new BMW(120.8 + i, 120.0 + 5*i, "bmw_"+ (i+1) + " x5");
            Mercedes c_class = new Mercedes(230.9 + 2*i, 120.8+ 6*i, "mercedes_"+ (i+1) + " c_class");
            Porsche panamera = new Porsche(340.8 + 3*i, 89.0+ 8*i, "Porsche_"+ (i+1) + " Panamera");
            demo.add(x_piat); demo.add(c_class); demo.add(panamera);
        }

        Map<Car, List<Car>> final_result = CarSorter.comparison(demo);
        System.out.println(final_result);
    }
}
