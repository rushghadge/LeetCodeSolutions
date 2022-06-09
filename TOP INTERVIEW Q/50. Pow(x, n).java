//iterat
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double current_product = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) { // for ODD value of n 3^3 = mul by extra 3 
                System.out.println("b ans: "+ans+" n "+n);
                ans = ans * current_product;
 System.out.println("A ans: "+ans);

            }
            current_product = current_product * current_product;
             System.out.println("CP : "+current_product);

        }
        return ans;
    }
};

// recursive:
class Solution {
    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }
};