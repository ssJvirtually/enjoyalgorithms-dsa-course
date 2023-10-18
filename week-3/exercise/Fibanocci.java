public class Fibanocci {

    



    public static void main(String[] args) {
     System.out.println(fib(0));   
    }


    public static int fib(int k){

        //base case
        if(k <= 0){
            return -1;
        }

        
        if(k == 1){
            return 0;
        }

        if(k == 2){
            return 1;
        }
        
        return fib(k-2)+ fib(k-1);
    }
}
