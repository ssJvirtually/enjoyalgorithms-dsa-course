public class FibanocciSeries {
    


    public static void main(String[] args) {
     System.out.println(fibanocci(10));   
    }
    

    public static int fibanocci(int n){
        int sum =1;
        for(int i=0;i<=n;i++){
            sum = sum + sum;
            System.out.println(sum);
        }

        return sum;
    }
}
