import java.util.*;
public class sellstock {
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,};
        int profit=0;
        int buyprice = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=buyprice){
                buyprice=arr[i];
            }
            profit = Math.max(profit,arr[i]-buyprice);


        }
        System.out.print(profit);
    }
}
