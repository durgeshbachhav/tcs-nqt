
import java.util.HashSet;
import java.util.Set;

public class Dup {
     public static void main(String[] args) {
          int arr[] = {1,2,3,4,5,6,7,8};
          System.out.println(checkDuplicateoptimize(arr));

     }
     public static boolean checkDuplicate(int arr[]){
          for(int i=0;i< arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                    if (arr[i]==arr[j]){
                         return true;
               }
          }
     }
          return false;
     }

     public static boolean checkDuplicateoptimize(int arr[]){
          Set<Integer> hs = new HashSet<>();

          int n = arr.length;
          for(int num:arr){
               if(hs.contains(num)){
                    return true;
               }
               hs.add(num);
          }
          return false; 
     }
}
