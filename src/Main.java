package MyAlgorithm;
import java.util.Arrays;





class Palindrome {

    public boolean c(int u)
    {
        String xAsString = Integer.toString(u);
        int END = xAsString.length() ;
        String leftToRigh = "";
        String rightToLeft = "";
        for (int i = 1; i <= xAsString.length(); i += 1) {
            leftToRigh += xAsString.substring(i - 1, i);
            rightToLeft +=  xAsString.substring(END - 1, END);
            END -= 1;
        }
        return leftToRigh.equals(rightToLeft);
    }


};
class Common_Prefix {
    private  int lessCharacterString(String[] strs)
    {
        int lessCharacter = strs[0].length();
        for(int i = 0; i < strs.length; i+= 1)
        {
            if(lessCharacter > strs[i].length())
            {
                lessCharacter = strs[i].length();
            }
        }
        return lessCharacter;
    }
    public String longestCommonPrefix(String[] strs) {

        String commonPrefix = "";
        int numberOfIterations = lessCharacterString(strs);
        outer:for(int i = 1; i <= numberOfIterations; i+= 1)
        {
            boolean condition = true;
            String currentSymbol = strs[0].substring(i - 1, i);
            inner: for(int j = 1; j < strs.length; j += 1)
            {
                String currentElementSymbol = strs[j].substring(i - 1, i);
                if (!currentElementSymbol.equals(currentSymbol))
                {
                    condition = false;
                    break outer;
                }
            }
            if (condition)
            {
                commonPrefix += currentSymbol;
            }
        }
        return commonPrefix;
    }


};
class ValidParenthesis {

    private boolean elementIsHere(char[] arr, char itself)
    {
        for(char a : arr)
        {
            if(itself == a)
            {
                return true;
            }
        }
        return false;
    }

    private int elementIndex(char[] arr, char itself)
    {
        if (elementIsHere(arr, itself))
        {
            for(int i = 0; i <arr.length; i+=1)
            {
                char a = arr[i];
                if(itself == a)
                {
                    return i;
                }
            }
        }
        return 0;
    }
    public boolean isValid(String s)
    {

        char[] openBraces = {'(', '[', '{'};
        char[] closingBraces = {')', ']', '}'};
        int[] numberOfOccurences = {0,0,0};
        for(int i = 0; i < s.length(); i+= 1)
        {
            char currenSymbol = s.charAt(i);
            if(currenSymbol == openBraces[0] || currenSymbol == closingBraces[0])
            {
                numberOfOccurences[0] += 1;
            }
            else if(currenSymbol == openBraces[1] || currenSymbol == closingBraces[1])
            {
                numberOfOccurences[1] += 1;
            }
            else if(currenSymbol == openBraces[2] || currenSymbol == closingBraces[2])
            {
                numberOfOccurences[2] += 1;
            }
        }
        for (int i = 0; i < numberOfOccurences.length; i+=1)
        {
            if(numberOfOccurences[i] % 2 != 0) {
                return false;
            }
        }
//        "({{{}}})"
//        openbraces[0] closingBraces[0]
//        openbraces[1] closingBraces[1]
//        openbraces[2] closingBraces[2]
        for(int i = 0; i < s.length(); i+=1)
        {
            char currentSymbol = s.charAt(i);
            if(elementIsHere(openBraces, currentSymbol))
            {
                int index = elementIndex(openBraces, currentSymbol);
                boolean isCorrect = false;
                for(int j = i; j < s.length(); j += 1)
                {
                    if(s.charAt(j) == closingBraces[index])
                    {
                        isCorrect = true;
                    }
                }
                if (!isCorrect)
                {
                    return false;
                }
            }
            else if (i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean function(String s)
    {
        char[] openBraces = {'(', '[', '{'};
        char[] closingBraces = {')', ']', '}'};

        for(int i = 0; i < s.length(); i += 1)
        {
            if (i % 2 == 0 && elementIsHere(openBraces, s.charAt(i)))
            {
                int index = elementIndex(openBraces, s.charAt(i));
                if (i != (s.length() - 1) && s.charAt(i + 1) != closingBraces[index])
                {
                    return false;
                }

            }
            else if (i % 2 == 0 && !elementIsHere(openBraces, s.charAt(i)))
            {
                return false;
            }
            if ( i % 2 != 0  && elementIsHere(closingBraces, s.charAt(i)))
            {
                if (i - 1 != 0 && !elementIsHere(openBraces, s.charAt(i-1)))
                {
                    return false;
                }
            }
            else if( i % 2 != 0  && !elementIsHere(closingBraces, s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

}
class RemoveElement{

    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int num : nums) {
            if (num != val) {
                nums[c] = num;
                c++;
            }
        }
        return c;
    }
};
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