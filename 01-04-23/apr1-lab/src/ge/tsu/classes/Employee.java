package ge.tsu.classes;

import ge.tsu.enums.Gender;
import ge.tsu.enums.Profession;

public class Employee {
    /*
    დაწერეთ მუშის (Employee) კლასი,
    რომელსაც ექნება შიდა კლასი სახელად Statistic. მუშას უნდა ჰქონდეს პროფესიის
    ენამი ველად. პროფესიის ენმას უნდა გააჩნდეს საშუალო ხელფასის ველი რომელსაც
    თქვენვე მოიფიქრებთ (მაგალითად, პროგრამისტი პროფესია საშუალო ხელფასით 600.00).


    სტატისტიკის კლასს უნდა ჰქონდეს
    ორი მეთოდი:

    1.მეთოდი რომელიც იტყვის აქვს თუ არა მუშას თავისივე პროფესიის საშუალოზე მეტი ხელფასი;

    2.მეთოდი რომელიც დააბრუნებს წლიურ ხელფასს მუშისას;

    ასევე მუშას ჰქონდეს კიდევ ერთი ენუმერირებადი ველი - სქესი (Gender).

    მთავარ მეთოდში შექმენით ერთი მაინც მუშა კლასის ობიექტი და ლამაზად დაწერეთ სტატისტიკის ორივე მეთოდის შედეგი
    ამ მუშისთვის.
    */

    private float salary;
    private final Profession profession;
    private final Gender gender;
    public Employee(float salary, Gender sex, Profession prof) {
        this.salary = salary;
        this.profession = prof;
        this.gender = sex;
    }

    public  class Statistic{
        public  boolean hasMoreThanSupposedToBe() {
            return salary > profession.getAnnualSalary();
        }

        public float AnnualSalary(){
            return salary * 12;
        }
    }
}
