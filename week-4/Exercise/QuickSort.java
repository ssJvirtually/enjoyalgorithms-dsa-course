import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    

    public static void main(String[] args) {
       int[] X = {1,5,8,7,6,2,4,3}; 
      int pivotIndex = pivotIndex(X,0,X.length-1);
      System.out.println(pivotIndex);
    }

    public static int pivotIndex(int[] X,int l,int r){
        
        int pivot = X[r];
        int i=l;
        for(int j=1;j<r;j++){
            if(X[j] < pivot ){
                int temp = X[i];
                X[i] = X[j];
                X[j] = temp;
                i++;
            }
        }
        int temp = X[i+1];
        X[i+1] = X[r];
        X[r] = temp;

        System.out.println(Arrays.toString(X));

        return X[i];
    }
}
