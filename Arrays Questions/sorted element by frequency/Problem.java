import java.util.*;
public class Problem {
     public static void main(String[] args) {
          

          int arr[]={2,5,2,8,2,6,8,8,6};
          int n = arr.length;

     }
     public static void countFreq(int arr[], int n){


          // create a map for storing frequency
          Map <Integer, Integer> hm = new HashMap<>();
          for(int num : arr){
               hm.put(num, hm.getOrDefault(num, 0)+1);
          }

          List<Map.Entry<Integer,Integer>> entrylist = new ArrayList<>(hm.entrySet());
          //sort entry list base on ascending order
          Collection.sort(entrylist,(entry1,entry2)->entry2.getValue().compareTo(entry1.getValue() ))

     }
}
