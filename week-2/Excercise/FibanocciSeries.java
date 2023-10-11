public class FibanocciSeries {
    


    public static void main(String[] args) {
     System.out.println(fib(10));   
    }
    

    public static int fib(int n) {
        // Base Case
        if (n <= 1)
            return n;
 
        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }
}
