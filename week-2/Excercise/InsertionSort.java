import java.util.Arrays;

public class InsertionSort {
    

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };

        System.out.println(Arrays.toString(insertionSortForwardSwapping(arr)));

    }


    /**
     *  Insertion sort using backward swapping
     * @param arr
     * @return
     */
    public static int[] insertionSortBackwardSwapping(int[] arr){
        //run loops and compare first two elements , then swap the elements accordingly

        for(int i=1;i<arr.length;i++){
            int k=i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[k]){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                    k--;
                    System.out.println(Arrays.toString(arr));

                }
            }

        }
        return arr;
    }


    /**
     * Insertion sort using forward swapping
     * @param arr
     * @return
     */
    public static int[] insertionSortForwardSwapping(int[] arr){
        //run loops and compare first two elements , then swap the elements accordingly

        for(int i=0;i<arr.length;i++){
            int k=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[k]){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                    k++;
                    System.out.println(Arrays.toString(arr));

                }
            }

        }
        return arr;
    }
}
