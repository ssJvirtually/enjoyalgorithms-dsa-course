public class MinMax {
    
    
    public static void main(String[] args) {
        
        int[] arr = {3,4,66,77,33,67,12,456,789};

       //MinMaxUsingIntegerMinMax(arr);
        MinMaxUsingLoop(arr);

    }


    //unfinished
    static void MinMaxUsingLoopPlusOne(int[] arr){
        if(arr.length % 2 == 0){
            
        }
        
        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i+=2){
            if(arr[i] < min){
                min = arr[i];
            }else{
                max = arr[i];
            }
        }

         System.out.println("min " +  min);

        System.out.println("max " +  max);
    }

    static void MinMaxUsingLoop(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }else{
                max = arr[i];
            }
        }

         System.out.println("min " +  min);

        System.out.println("max " +  max);
    }


    static void MinMaxUsingIntegerMinMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
       }

        System.out.println("min " +  min);

        System.out.println("max " +  max);
    }
}
