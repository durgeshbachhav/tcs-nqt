import java.util.Arrays;

public class AddArray {
     public static int[] addarray(int[]arr,int x){
          int n = arr.length;
          int newArr[] = new int[n+1];

          for(int i=0;i<n;i++){
               newArr[i]=arr[i];
               newArr[n]=x;
          }
          return newArr;
          
     }
     public static void main(String[] args) {
          int n= 10;
          int arr[]= {1,2,3,4,5,6,7,8,9,10};
          
          // for(int i=0;i<n;i++){
          //      arr[i] = sc.nextInt();
          // }
          // for(int i=0;i<n;i++){
          //      System.out.print(" "+arr[i]);
          // }
          int addthiselement = 50;
          // addarray(arr, addthiselement);
          System.out.println(Arrays.toString(addarray(arr, addthiselement)));


     }
}
