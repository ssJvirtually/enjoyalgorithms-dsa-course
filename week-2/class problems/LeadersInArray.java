
import java.util.ArrayList;

public class LeadersInArray {
    
    
	public static void main (String[] args) {
        int[] A = {16,17,4,3,5,2};

        ArrayList<Integer> leaders = Solution.leaders(A, A.length);;

		System.out.println(leaders);
	}
}



class Solution{
    //Function to find the leaders in the array.
   public static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> leadersInArray = new ArrayList();
        
        
        //Last element is the leader by default
        int previousLeaderEle = arr[n-1];
        
        leadersInArray.add(previousLeaderEle);
        
        
        //loop from right to left and compare the previous greatest element and keep updating the element till the end
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= previousLeaderEle){
                previousLeaderEle = arr[i];
                leadersInArray.add(0,arr[i]);
            }
        }
        
        return leadersInArray;
        
    }
}

