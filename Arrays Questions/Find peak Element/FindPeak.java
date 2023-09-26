

public class FindPeak {
     public static void main(String[] args) {
          
          int arr[]={ 1,2,3,4,5,89,6,78};
          int n = arr.length;
          System.out.println(peakFinderOptimize(arr, n));
     }

     /*
      * pseudocode for this code
               function findPeakElement(arr):
               n = length of arr
               if n == 1:
                    return 0
               
               if arr[0] > arr[1]:
                    return 0
               
               if arr[n - 1] > arr[n - 2]:
                    return n - 1
               
               for i = 1 to n - 2:
                    if arr[i] > arr[i - 1] and arr[i] > arr[i + 1]:
                         return i

               return -1


               tc => O(n)
      */
     public static int peakFinder(int arr[],int n){
          if(n == 0){
               return -1; 
          }
          if(arr[0]> arr[1]){
               return -1;
          }
          if(arr[n-1]>arr[n-1]){
               return n-1;
          }
          for(int i=1;i<n;i++){
               if(arr[i]> arr[i-1] && arr[i] > arr[i+1]){
                    return arr[i];
               }
          }
          return -1;
     }


     /*
      * function findPeakElement(arr):
          n = length of arr
          left = 0
          right = n - 1
          
          while left < right:
               mid = left + (right - left) / 2
               
               if arr[mid] > arr[mid + 1]:
                    right = mid
               else:
                    left = mid + 1
          
          return left

      */
     public static int peakFinderOptimize(int arr[] , int n){

          int left = 0;
          int right = n-1;

          while (left < right) {
               int mid = left + (right - left) / 2;
   
               if (arr[mid] > arr[mid + 1]) {
                   right = mid;
               } else {
                   left = mid + 1;
               }
           }
   
           return arr[left];

     }

}
