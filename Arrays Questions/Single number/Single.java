

public class Single {
     public static void main(String[] args) {
          
          int arr[] ={ 1,1,3,2,2,25,6,6};
          int n = arr.length;
          System.out.println(singleNum(arr, n));

     }
     public static int singleNum(int arr[], int n){
          //run loop from 0 to n
          for(int i=0;i<n;i++){
               int num= arr[i];
               int count = 0;
               //use linear search to found element
               for(int j =0;j<n;j++){
                    if(arr[j] == num){
                         count++;
                    }
               }
               if(count == 1 ) return num;
          }
          return -1;
     }
}
