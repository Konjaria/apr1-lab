package ge.tsu;
import ge.tsu.classes.Employee;
import ge.tsu.enums.Gender;
import ge.tsu.enums.Profession;

public class Main {
    public static void main(String[] args) {
        Employee A = new Employee(200_000_001, Gender.MALE, Profession.PROGRAMMER);
        Employee.Statistic B = A.new Statistic();
        System.out.println("Current Employee's annual salary: $ " + B.AnnualSalary());
        System.out.println("Statement that current Employee has more that supposed to be is : " +B.hasMoreThanSupposedToBe());
    }
}