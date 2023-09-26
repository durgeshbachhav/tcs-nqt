

public class Move {
     public static void Movezeroes(int arr[]){
          int n = arr.length;
          int count = 0;
          for(int i=0;i<n;i++){
               if(arr[i] != 0){
                    arr[count++]=arr[i];  
               }
          }
          while(count < n){
               arr[count++]=0;
          }
     }


     public static void Movezeroes1(int arr[]){
          int zero = 0;
          int n = arr.length;
          for(int i=0;i<n;i++){
               if(arr[i] != 0){
                    swap(arr, zero, i);
                    zero++;
               }
          }
          for(int i=0;i<n;i++){
               System.out.print(arr[i]+",");
          }
     }
     //swap function for movezeroes1
     public static void swap(int arr[] , int a,int b){
          int temp = arr[a];
          arr[a]=arr[b];
          arr[b]=temp;
     }
     public static void main(String[] args){

          int arr[] = { 1,0,3,0,37,0,3};
          System.out.println("Array before moving zeroes");
          for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+", ");
          }
          System.out.println("after moving");
          Movezeroes1(arr);
          for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+", ");
          }

     }
}
