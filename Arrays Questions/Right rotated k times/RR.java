

public class RR {
     public static void main(String[] args) {
          
          int arr[]={1,2,3,4,5,6};
          int n = arr.length;
          int k = 2;
          rightRotated(arr, n, k);
     }
     public static void rightRotated(int arr[] ,int n, int k){
          //if agar k jo hai kabhi n means array ki length se bada ho jaye to use k = k% n se kam kar ko
          k = k%n;

          for(int i=0;i<n;i++){
              if(i<k){
                System.out.print(" "+arr[n+i-k]);
              }else{
               System.out.print(" "+arr[i-k]);
              }
          }
          
     }
}
