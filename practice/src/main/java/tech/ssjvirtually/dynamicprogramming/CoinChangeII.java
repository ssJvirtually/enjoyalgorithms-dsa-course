package tech.ssjvirtually.dynamicprogramming;

public class CoinChangeII {

    public static void main(String[] args) {
       int amount = 5;
       int[] coins = {1,2,5};

        System.out.println(change(amount,coins));

    }

    static int count=0;
    public static int change(int amount, int[] coins) {
        changeUtil(amount,coins,coins.length);
        return count;
    }

    static void changeUtil(int amount, int[] coins, int n){
        if(amount == 0){
            count++;
            return;
        }
        if(amount < 0){
            return;
        }
        int coin = 0;

        while(coin < n ){
            changeUtil(amount-coins[coin],coins,n);
            coin++;
        }
    }
}
