public class Hypergeometric
{
    public int factorial(int n) {
        int f = 1, j = 1;
        while (j <= n) {
            f = f * j;
            j++;
        }
        return f;
    }
    
    public double computeHypergeometric(int N, int m, int r, int y){
       double topLeft = factorial(r) / factorial(y);
       double topRight = factorial(N - r) / factorial(m - y);
       double bottom = factorial(N) / factorial(m);
       double result = (topLeft * topRight) / bottom;
       return result;
    }
    
}
