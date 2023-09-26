import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
     public static int[] getTwoSum(int [] arr,int target){
          int temp[]=new int[2];
          int n = arr.length;
          temp[0]=temp[1]=-1;
          for(int i=0;i<n;i++){
               for(int j=i+1;j<n;j++){
                    if(arr[i]+arr[j]==target){
                         temp[0]=i;
                         temp[1]=j;
                    }
               }
          }
          return temp;
     }

     public static int[] getTwoSum1(int [] arr,int target){
          int temp[]=new int[2];
          int n = arr.length;
          HashMap<Integer,Integer> hm = new HashMap<>();
          for(int i=0;i<n;i++){
               int x = arr[i];
               int findinMap = target - x;
               if(hm.containsKey(findinMap)){
                    temp[0]=hm.get(findinMap);
                    temp[1]=i;
                    return temp;

               }
               hm.put(arr[i], i);
          }
          return temp;
     }
     public static void main(String[] args) {
          int arr[]={ 2,4,16,5,13};
          int target = 20;
          int[] result= getTwoSum1(arr, target);
          System.out.println(Arrays.toString(result));


     }
}