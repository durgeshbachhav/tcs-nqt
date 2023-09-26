

public class SA {
     // bruete approach
     // tc => O(n2)
     public static boolean CheckSorted(int[] arr){

          for(int i=0;i<arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                    if (arr[i]>arr[j]){
                         return false;
                    }
               }
          }
          return true;
     }
     
     // optimal approach
     // tc => O(n)
     public static boolean CheckSortedoptimal(int[] arr){

          for(int i=1;i<arr.length;i++){
               if(arr[i] < arr[i-1]){
                    return true;
               }
          }
          return false;
     }

     public static void main(String[] args) {
          int a[]={1,2,13,4,5,6,7};
          System.out.println("Is Sorted? "+CheckSortedoptimal(a));
          
     }
}
