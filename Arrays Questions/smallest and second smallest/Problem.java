import java.util.Arrays;

public class Problem {
     public static void main(String[] args) {
          
          int arr[]={12,25,8,55,10,11,33,17,11};
          int n = arr.length;
          Solution1(arr, n);
     }

     public static void Solution(int arr[],int n){
          Arrays.sort(arr);
          System.out.println("first smallest number : "+arr[0]);
          System.out.println("second smallest number : "+arr[1]);

     }

     public static void Solution1(int arr[],int n){
          int smallest = Integer.MAX_VALUE;
          for(int i=0;i<n;i++){
               if(arr[i]<smallest){
                    smallest = arr[i];  
               }
          }
          //for second smallest
          int secondSmallest = Integer.MAX_VALUE;
          for(int i=0;i<n;i++){
               if(arr[i]<secondSmallest && arr[i]> smallest){
                    secondSmallest = arr[i];
               }
          }
          System.out.println("First Smallest Number is: " + smallest );
          System.out.println("Second Smallest Number is:"  + secondSmallest );
     }
}
