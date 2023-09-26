import java.util.*;

public class Majority {
     public static void main(String[] args) {
          
          int arr[]={ 1,1,1,1,2,3,4};
          int n=  arr.length;
          System.out.println(getmajority(arr, n));;

     }

     //brute force approach
     public static int getmajority(int arr[],int n){
          for(int i=0;i<n;i++){
               int count = 0;
               for(int j=0;j<n;j++){
                    if(arr[j]==arr[i]) count++;
               }
               if(count >= n/2)return arr[i];
          }
          return -1;
     }
     //optimize this

     public static int getmajority1(int arr[], int n){
          HashMap <Integer, Integer> hm= new HashMap<>();
          int count = 0;
          //storing the element with its occurance
          for(int i=0;i<n;i++){
               //check that hm mein element pehle se moujood hai ya nhi
               int value = hm.getOrDefault(arr[i],0);
               hm.put(arr[i], value + 1);
          }

          for (Map.Entry<Integer, Integer> it : hm.entrySet()) {
               if (it.getValue() > (n / 2)) {
                   return it.getKey();
               }
           }
          return -1;
     }
}
