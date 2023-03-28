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