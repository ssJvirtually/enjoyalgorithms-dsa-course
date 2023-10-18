import java.util.Arrays;

public class MergeSortWithRecursion {
    


    public static void main(String[] args) {
     
        
        int[] arr = {4,3,2,5,7,1,8,9};

        mergeSort(arr, 0, arr.length-1);
    }


    public static void merge(int arr[], int mid ,int l,int r){

    }



    /**
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int  mergeSort(int[] arr,int left,int right ){

        //System.out.println(Arrays.toString(arr));
        
        for(int i=left;i<=right;i++){
            System.out.println(arr[i]);
        }

        System.out.println("-----------------------");

        if(left <right){
        // if(arr.length == 1){
        //     return arr[0];
        // }

        
            int mid = left + (right -left) /2;
            //split left half
            mergeSort(arr, left, mid);
            //split right half
            mergeSort(arr,mid+1,right);

            //merge sorted halves
            

        }
        return 0;
    }
    
}
