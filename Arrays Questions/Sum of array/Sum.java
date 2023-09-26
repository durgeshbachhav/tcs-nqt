

public class Sum {

     public static int sumofarray(int [] arr){
          int sum =0;
          for(int i=0;i<arr.length;i++){
               sum = sum + arr[i];
          }
          return sum;
     }
     public static int sumofarray1(int [] arr){
          int sum =0;
          for(int i=0;i<arr.length;i++){
               sum += arr[i];
          }
          return sum;
     }


     public static void main(String[] args) {
          int arr[]= {1,2,3};
          System.out.println("Sum of array elements is: "+sumofarray(arr));
          
     }
     
}
