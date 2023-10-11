public class FibanocciSeries {
    


    public static void main(String[] args) {
     System.out.println(fib(9));   
    }
    

    public static int fib(int n){
        int n0 = 0;
        int n1 = 1;

        int sum =0;
        int count =1;
        while(count < n){
            sum = n0 + n1;
            n0 = n1;
            n1 = sum;
            count++;
        }
        return sum;
    }
}
