package Apr7;

/**
 * This is the class called Apr7.Person.
 *     შექმენით Apr7.Human აბსტრაქტული კლასის შვილი კლასი - Apr7.Person, რომელიც იმპლემენტაციას გაუკეთებს
 *     არსებულ ორ აბსტრაქტულ მეთოდს (ანუ, გადაფარავს მათ) და ჭამის დროს დაბეჭდავს, რომ
 *     პიროვნება ჭამს შესაბამისი სახელის საჭმელს. ხოლო, სახელის თქმის დროს დააბრუნებს სტრინგს
 *     შესაბამისი მისალმებით: "გამარჯობა, {პიროვნების სახელი}".
 */
public class Person  extends Human{
    public Person(String name, int age, float weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public String sayHelloTo(Human anotherHuman) {
        return "Hello, " + anotherHuman.name;
    }

    @Override
    public void eatFood(String foodName) {
        System.out.println('-' + this.name + " is eating " + foodName + " for now.!!! \n" +
                           "- I guess " + this.name + " doesn't share food. :(" );
    }


//    @Override
//    public String toString() {
//        return "Apr7.Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", weight=" + weight +
//                ", height=" + height +
//                '}';
//    }

}
