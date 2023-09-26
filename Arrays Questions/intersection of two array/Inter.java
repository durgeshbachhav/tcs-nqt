import java.util.*;

public class Inter {
     
     public static void main(String[] args){
          int arr1[]={ 1,2,3,4,5,6};
          int arr2[]={4,5,6,7,8,9};
          int n = arr1.length;
          int m = arr2.length;
          List <Integer> result = findIntersection(arr1, arr2, n, m);
          System.out.println("The Intersection of two arrays is: "+result);
     }

     //find intersection
     public static List findIntersection(int arr1[], int arr2[], int n, int m){
          List<Integer> intersection= new ArrayList<>();

          Set <Integer> hs  = new HashSet<>();

          for(int num : arr1){
               hs.add(num);
          }

          for(int num : arr2){
               if(hs.contains(num)){
                    intersection.add(num);

                    // for handle repeated element we just remove element from set
                    hs.remove(num);
               }
          }
          return intersection;
     }
}
