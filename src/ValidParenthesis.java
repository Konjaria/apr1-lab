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