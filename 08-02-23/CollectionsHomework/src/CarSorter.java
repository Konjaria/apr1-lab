import java.util.*;

/** დაწერეთ დამხმარე კლასი მანქანებისთვის რომელსაც ექნება მანქანების სიის დალაგების მეთოდი წონის მიხედვით. დაწერეთ მეორე მეთოდიც რომელიც სიჩქარის მიხედვით დაალაგებს.*/
public class CarSorter {

    public void sortByWeight(List<Car> demo){
        Comparator<Car> iter = new Comparator<Car>(){
            @Override
            public int compare(Car o, Car o1) {
                return Double.compare(o.weight, o1.weight);
            }
        };
        demo.sort(iter);
        System.out.println(demo);
    }

    public void sortBySpeed(List<Car> demo){
        Collections.sort(demo);
        System.out.println(demo);
    }
    /**
        ერთი ფუნქცია რომელიც დააბრუნებს Map-ს სადაც გასაღები იქნება
        მანქანა და მნიშვნელობა იქნება ის მანქანები, რომლებსაც ამ მანქანაზე ნაკლები წონა აქვთ.
    */
    public static Map<Car, List<Car>> comparison(List<Car> demo){
        Comparator<Car> compareWeights = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Double.compare(o1.weight, o2.weight);
            }
        };
        Random rand = new Random();
        int lower_bound = 0, upper_bound = demo.size(), rand_index = rand.nextInt(lower_bound, upper_bound);
        Car key = demo.get(rand_index);
        List<Car> list_of_values = new ArrayList<Car>();
        System.out.println("Key: " + key);

        for (int i = 0; i < demo.size(); i++) {
            int curr_result = compareWeights.compare(key, demo.get(i));
            if(curr_result > 0 &&  i != rand_index){
                list_of_values.add(demo.get(i));
            }
        }
        Map<Car, List<Car>> final_result = new HashMap<>();
        final_result.put(key, list_of_values);
        return final_result;
    }


}
