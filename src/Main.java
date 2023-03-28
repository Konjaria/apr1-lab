package MyAlgorithm;
import java.util.Arrays;


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