package ArraysAndArrayListsDemo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Student student = new Student(name, list of marks);  Done
 * int number = student.getNumberOfMarks();
 * int sum = student.getTotalSumOfMarks();
 * int maximumMark = student.getMaximumMark();
 * int minimumMark = student.getMinimumMark();
 * BigDecimal average = student.getAverage
 * student.addNewMark(35);
 * student.removeMarkAtIndex(5);
 *
 *
 * **/
public class Student {
    private String name;
    private ArrayList<Integer> ListOfMarks;

    Student(String name, ArrayList<Integer> ListOfMarks) {
        this.name = name;
        this.ListOfMarks = ListOfMarks;
    }

    public void setListOfMarks(ArrayList<Integer> listOfMarks) {
        ListOfMarks = listOfMarks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getListOfMarks() {
        return ListOfMarks;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", ListOfMarks=" + ListOfMarks + '}';
    }

    public int getNumberOfMarks(){
        return this.ListOfMarks.size();
    }

    public int getTotalSumOfMarks(){
        int sum  = 0;
        for (Integer listOfMark : this.ListOfMarks) {
            sum += listOfMark;
        }
        return sum;
    }


    public Integer getMaximumMark(){
        if (this.getListOfMarks().size() > 0){
            int max = this.getListOfMarks().get(0);
            for (Integer listOfMark : getListOfMarks())
                if(max < listOfMark)
                    max = listOfMark;
            return max;
        }
        return null;
    }

    public Integer getMinimumMark(){
        if (this.getListOfMarks().size() > 0){
            int min = this.getListOfMarks().get(0);
            for (Integer listOfMark : getListOfMarks())
                if(min > listOfMark)
                    min = listOfMark;
            return min;
        }
        return null;
    }

    public BigDecimal getAverage(){
        if (this.ListOfMarks.size() > 0)
            return new BigDecimal(getTotalSumOfMarks()/getListOfMarks().size());
        return null;
    }

    public void addNewMark(int mark){
        this.ListOfMarks.add(mark);
    }

    public void removeMarkAtIndex(int index){
        this.ListOfMarks.remove(index);
    }


    public static void main(String[] args) {

        ArrayList<Integer> Your_Marks = new ArrayList<>(){{
                //Your_Marks.add({100, 97, 56, 76, 89, 90})
                add(100);
                add(97);
                add(56);
                add(76);
                add(89);
                add(90);
        }};

        Student student = new Student("Saba", Your_Marks);
        student.addNewMark(105);

        System.out.println("Before Deletion: " + student);
        student.removeMarkAtIndex(3);
        System.out.println("After Deletion:  " + student);

        int number = student.getNumberOfMarks();
        int sum = student.getTotalSumOfMarks();
        int maximumMark = student.getMaximumMark();
        int minimumMark = student.getMinimumMark();
        BigDecimal average = student.getAverage();


        System.out.println("Number:  " + number);
        System.out.println("Sum:  " + sum);
        System.out.println("Max:  " + maximumMark);
        System.out.println("Min:  " + minimumMark);
        System.out.println("Average:  " + average);

    }
}
