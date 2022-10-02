public class Factorial {

    public static int factorial( int n )
    {
        if ( n == 1 || n == 0 )
            return 1;
        else {
            int result = n * factorial(n-1);
            return result;
        }
    }
}
