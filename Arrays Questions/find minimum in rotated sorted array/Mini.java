

public class Mini {
     public static int findMin(int arr[]){
          int mini = Integer.MAX_VALUE;
          int n = arr.length;
          for(int i=0;i<n;i++){
              mini=Math.min(mini, arr[i]); 
          }
          return mini;
     }
     public static void main(String[] args) {
          int arr[]={4,5,6,7,11,2,3};
          System.out.println(findMin(arr));
     }
}
