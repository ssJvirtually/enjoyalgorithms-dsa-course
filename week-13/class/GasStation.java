public class GasStation {


    public static void main(String[] args) {

      int[] gas = {1,2,3,4,5};
      int[] cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuitE(gas,cost));
    }

    //efficient
    public static  int canCompleteCircuitE(int[] gas, int[] cost) {
        // Get the number of gas stations
        int n = gas.length;

        // Variables to track the total surplus gas, current surplus, and the starting index
        int total_surplus = 0;
        int surplus = 0;
        int start = 0;

        // Iterate through each gas station
        for (int i = 0; i < n; i++) {
            // Calculate the surplus gas at the current station and update total surplus
            total_surplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];

            // If the current surplus is negative, reset it and update the starting index
            if (surplus < 0) {
                surplus = 0;
                start = i + 1;
            }
        }

        // If the total surplus is negative, it means it's not possible to complete the circuit
        // Otherwise, return the starting index
        return (total_surplus < 0) ? -1 : start;
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;

        //brute force
        for(int i=0;i<n;i++){
            int count = 0;
            int totalFuel = 0;
            int j=i;
            while(count<n){
                totalFuel += gas[j % n];
                int costToReachNextStation = cost[j % n];

                if(costToReachNextStation > totalFuel){
                    break;
                }

                totalFuel = totalFuel-costToReachNextStation;

                j++;
                count++;
                if(j == n){
                    j=0;
                }
            }

            if(count == n && totalFuel >=0 ){
                return i;
            }
        }

        return -1;

    }
}
