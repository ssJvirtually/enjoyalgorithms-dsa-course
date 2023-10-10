public class validMountainArray {
    
public static void main(String[] args) {
 
    int[] a = {0,3,2,1};

    System.out.println(validMountainArray(a));
}

public static boolean validMountainArray(int[] arr) {

    if(arr.length < 3 || arr[1] < arr[0]){
       return false; 
    }

     for(int i=1;i<arr.length;i++){
        //same element
         if(arr[i-1] == arr[i] ){
             return false;
         }  
     }


     int decreasingIndex = -1;


     for(int i=1;i<arr.length;i++){
         if(arr[i-1] > arr[i]){
             decreasingIndex = i;
             break;
         }
     }

     if(decreasingIndex == -1){
         return false;
     }

     for(int i=decreasingIndex + 1;i<arr.length;i++){
         if(arr[i-1] < arr[i]){
             return false;
         }
     }



       return true;
     }
 


}
