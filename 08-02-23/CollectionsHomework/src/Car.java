/**შექმენით მანქანის აბსტრაქტული კლასი, რომელსაც ექნება მანქანისთვის დამახასიათებელი: სიჩქარე და წონა. + იყოს
 შედარებადი! (ან ინტერფეისი იყოს ან აბსტრაქტული კლასი).

 შექმენით მანქანები: BMW, Mercedes, Porsche.

 ამ მანქანებს ჰქონდეთ დამატებითი ველი: მოდელი.

 დაწერეთ დამხმარე კლასი მანქანებისთვის რომელსაც ექნება მანქანების სიის დალაგების მეთოდი წონის მიხედვით.

 დაწერეთ მეორე მეთოდიც რომელიც სიჩქარის მიხედვით დაალაგებს.

 მთავარ მეთოდში შექმენით სია მანქანების და გამოიძახეთ ორივე დამხმარე მეთოდი.

 კარგად დაბეჭდეთ

 გამოიყენეთ, თუ გინდათ, Collections.sort(...), ან carList.sort().

 *ვინც მორჩება დაწეროს ერთი ფუნქცია რომელიც დააბრუნებს Map-ს სადაც გასაღები იქნება მანქანა და მნიშვნელობა იქნება ის
 მანქანები, რომლებსაც ამ მანქანაზე ნაკლები წონა აქვთ.*/
public abstract class Car implements Comparable<Car>{
    double speed, weight;

    @Override
    public int compareTo(Car another){
        return Double.compare(this.speed, another.speed);
    }

    public Car(double speed, double weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "speed=" + speed + ", weight=" + weight + '\n';
    }
}
