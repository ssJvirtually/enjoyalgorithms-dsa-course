package excercise;

import java.util.Arrays;
import java.util.Comparator;

public class temp {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.reverse();

        int[][] arr = {{1,100},{11,22},{1,11},{2,12}};

// Sorting based on the second column (index 1)
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        System.out.println(Arrays.deepToString(arr));
    }
}
