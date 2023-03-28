
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