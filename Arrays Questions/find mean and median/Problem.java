import java.util.Arrays;

public class Problem {
     
     public static int FindMean(int arr[], int n){
          int sum = 0;
          for(int i=0;i<n;i++){
               sum +=arr[i];
          }
          return (sum/n);
     }

     public static double FindMedian(int arr[] ,int n){
          //if array is not sorted

          Arrays.sort(arr);

          if(n%2 != 0){
               return (double)arr[n / 2];
          }
          return (double) (arr[(n-1)/2]+arr[n/2]) / 2;
     }
     public static void main(String[] args) {
          int arr[] ={ 1, 3, 4, 2, 7, 5, 8, 6 };
          int n = arr.length;

          System.out.println(FindMean(arr, n));
          System.out.println(FindMedian(arr, n));
     }
}


