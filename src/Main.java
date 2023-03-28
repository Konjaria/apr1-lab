package MyAlgorithm;
import java.util.Arrays;


class Insert{

    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i += 1){
            if (target <= nums[i])
            {
                return i;
            }
        }
        return nums.length;
    }
};
class LengthOfTheLastWord{

    public int lengthOfLastWord(String s) {
        int counter = 0;
        String result = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            result += c;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            result += c;
        }
        boolean keyIsFounded = false;
        for(int i = s.length() ; i > 0; i -=1)
        {
            if(keyIsFounded && s.charAt(i - 1) == ' ')
            {
                break;
            }
            if(result.contains(s.substring(i -1 , i)))
            {
                keyIsFounded = true;
                counter += 1;
                System.out.println("Yes it is");
            }
        }
        return counter;
    }

    public int lengthofLastWord(String s) {
        int counter = 0;
        boolean keyIsFounded = false;
        for(int i = s.length() ; i > 0; i -=1)
        {
            if(keyIsFounded && s.charAt(i - 1) == ' ')
            {
                break;
            }
            if(s.charAt(i - 1) != ' ')
            {
                keyIsFounded = true;
                counter += 1;
            }
        }
        return counter;
    }
};
class PlusOne{

    public int[] plusOne(int[] digits) {
        digits = Arrays.stream(digits).sorted().toArray();
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        return digits;
    }

    public int[] plusone(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i-=1)
        {

            if(digits[i] == 9)
            {
                digits[i] = 0;
            } else {
                digits[i] += 1; break;
            }
        }
        if(digits[0] == 0)
        {
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            System.arraycopy(digits, 0, temp, 1, digits.length);
            digits = temp;
        }
        return digits;
    }

}
class Exercism {
    class Lasagna {
        // TODO: define the 'expectedMinutesInOven()' method
        public int expectedMinutesInOven(){
            return 40;
        }
        // TODO: define the 'remainingMinutesInOven()' method
        public int remainingMinutesInOven(int elapseTime){
            return Math.max((40 - elapseTime), 0);
        }
        // TODO: define the 'preparationTimeInMinutes()' method
        public int preparationTimeInMinutes(int numberOfLayers){
            return numberOfLayers * 2;
        }
        // TODO: define the 'totalTimeInMinutes()' method
        public int totalTimeInMinutes(int numberOfLayer, int elapseTime){
            return numberOfLayer*2 + elapseTime;
        }
    }
    class AnnalynsInfiltration {
        public static boolean canFastAttack(boolean knightIsAwake) {
            return knightIsAwake;
        }

        public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
            return  knightIsAwake && archerIsAwake && prisonerIsAwake;
        }

        public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
            return !archerIsAwake || prisonerIsAwake;
        }

        public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
            if (!prisonerIsAwake)
                return true;
            else return knightIsAwake && archerIsAwake && petDogIsPresent;
        }
    }

}
class NumericalAnalysis{

    public  void Main(){
        int[][] matrix = new int[6][6];

        for(int row = 0; row < 6; row+=1)
        {
            for(int col = 0; col < 6; col+=1)
            {
                matrix[row][col] = (int) (1 / (row + col + 1));
            }
        }
        for(int row = 0; row < 6; row+=1)
        {
            for(int col = 0; col < 6; col+=1)
            {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }



    }
}
public class scratch {
    public static void main(String[] args) {
    }
}