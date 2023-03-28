class EuclidAlgorithm{

    public int GCD(int m, int n)
    {
        int gcd = 0;
        if (m > n)
        {
            int remainder = m % n;
            while (remainder != 0) {
                m = n;
                n = remainder;
                remainder = m % n;
            }
            gcd = n;
        }
        else if (n > m)
        {
            int remainder = n % m;
            while (remainder != 0)
            {
                n = m;
                m = remainder;
                remainder = n % m;
            }
            gcd = m;
        }
        return gcd;
    }



};
