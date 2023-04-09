package ge.tsu;
import ge.tsu.classes.*;
import ge.tsu.enums.Gender;
import ge.tsu.enums.Profession;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        Employee A = new Employee(200_000_001, Gender.MALE, Profession.PROGRAMMER);
        Employee.Statistic B = A.new Statistic();
        System.out.println("Current Employee's annual salary: $ " + B.AnnualSalary());
        System.out.println("Statement that current Employee has more that supposed to be is : " +B.hasMoreThanSupposedToBe());
        smallTower myHouse = new smallTower(5, false, 5);
        System.out.println(myHouse.getFloor());
        House[] Houses = {
                new smallTower(0,false,1),
                new trumpTower(12,true,3),
                new smallTower(0,true,2),
        };
        houseService service = new houseService();
        for (House house : Houses) {
            System.out.println(house);
            house.destroy();
            service.installElevator(house);
        }

       try{
           int f = 1/0;
           System.out.println("28th line");
       } catch(ArithmeticException e){
           System.out.println("30th line");
           throw new RuntimeException("Arithmetic Exception occured");
       } catch(Exception e){
           e.printStackTrace(System.out); // Instead of std::err stacktrace will be output from the output stream
       } finally {
           System.out.println("Finally Block called");

       }
    }


    public static void foo() throws Exception{
        Exception e = new Exception("Oh My God :(");
        throw e;

    }}