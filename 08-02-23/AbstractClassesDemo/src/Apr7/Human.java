package Apr7;

/**
 * This is the class called Apr7.Human.
 * დაწერეთ აბსტრაქტული კლასი Apr7.Human. დაუწერეთ ამ კლასს ადამიანისთვის საჭირო ველები,
 *     მეთოდები და, ასევე, დაუწერეთ ამ კლასს აბსტრაქტული მეთოდები:
 *     void eatFood(String foodName)
 *     String sayHelloTo(Apr7.Human anotherHuman)
 *     შექმენით ამ აბსტრაქტული კლასის შვილი კლასი - Apr7.Person, რომელიც იმპლემენტაციას გაუკეთებს
 *     არსებულ ორ აბსტრაქტულ მეთოდს (ანუ, გადაფარავს მათ) და ჭამის დროს დაბეჭდავს, რომ
 *     პიროვნება ჭამს შესაბამისი სახელის საჭმელს. ხოლო, სახელის თქმის დროს დააბრუნებს სტრინგს
 *     შესაბამისი მისალმებით: "გამარჯობა, {პიროვნების სახელი}".
 *     მთავარ მეთოდში დაწერეთ ადამიანების მასივი, რამდენიმე ადამიანით, და გამოიძახეთ არსებული
 *     მეთოდები ამ ადამიანებისთვის. შედეგები დაბეჭდეთ კონსოლში, ლამაზად.
 */
public abstract class Human {
    public String name;
    public int age;
    public float weight;
    public int height;
    public String gender;

    Human(String name, int age, float weight, int height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public void eatFood(String foodName){
        System.out.printf("%s is eating %s for the moment.\n", this.name, foodName);
    }

    public String sayHelloTo(Human anotherHuman) {
        return "Hello, " + anotherHuman.name;
    }

    @Override
    public String toString() {
        return "Apr7.Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
