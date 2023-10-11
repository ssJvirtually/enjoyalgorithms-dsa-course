

public class BuildingsFacingSun {

    public static void main(String[] args) {

        int[] heights = { 9,2,3,8,4,5 };

        System.out.println(solution(heights));

    }

    public static int solution(int[] heights) {
        int count = 1;
        int currentMaxHeight = heights[0];
        for (int i = 1; i < heights.length; i++) {
            
            if (heights[i] > currentMaxHeight) {
                currentMaxHeight = heights[i];
                count++;
            }
        }
        return count;

    }

}