import java.util.Arrays;

public class InsertionSortUsingBinarySearch {

    
    public static void main(String[] args) {
        int arr[] = { 3,2,5,1,8,4,0 };

        System.out.println(Arrays.toString(insertionSortUsingBinarySearch(arr)));


    }

    public static int[] insertionSortUsingBinarySearch(int[] arr){
        

        int n=arr.length;

        for(int i=1;i<n;i++){
            int key=i;

            int l=0,r=key+1;

            while(l<=r){
               int mid = l+((r-l)/2);

               if(arr[mid] < key){
                   int temp = arr[mid];
                   arr[mid] = arr[key];
                   arr[key] = arr[temp];
               }

            }
        }




        return arr;
    }

}

//        int indexToSwap = -1;
//        //do binary search here
//        if(i>1){
//        int startIndex = 0;
//        int endIndex = key;
//        boolean keyNotFound = true;
//
//        while(startIndex <= endIndex){
//
//        int   mid = startIndex + endIndex / 2;
//
//        //if key is at mid
//        if(arr[mid] < arr[key] && arr[mid+1] > arr[key]){
//        indexToSwap = mid+1;
//        keyNotFound = false;
//        break;
//        }
//
//        //if key is greater
//        if(arr[mid] < key){
//        startIndex = mid + 1;
//        }
//        //if key is smaller
//        else{
//        endIndex = mid-1;
//        }
//
//        }
//        if(indexToSwap != -1){
//        int temp = arr[indexToSwap];
//        arr[indexToSwap] = arr[key];
//        arr[key] = temp;
//        }

