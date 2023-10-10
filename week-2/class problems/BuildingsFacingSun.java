import java.util.List;

public class BuildingsFacingSun {

    public static void main(String[] args) {

        int[] heights = { 2,3,4,5 };

        System.out.println(solution(heights));

    }

    public static int solution(int[] heights) {
        int count = 1;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[i - 1]) {
                count++;
            }
        }
        return count;

    }

}