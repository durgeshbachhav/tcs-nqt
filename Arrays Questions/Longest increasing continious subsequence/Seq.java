import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seq {
     public static void main(String[] args) {
          
          int arr[]={2, 4, 6, 8, 1, 3, 5, 7};
          int n = arr.length;

          System.out.println((findSubSequence(arr, n)));
     }

     /*
      * Function longestIncreasingSubsequence(arr):
    N = length of arr
    
    Initialize tailTable of size N to track the growing subsequence 
    tailTable[0] = arr[0]
    len = 1  => it define how many element in tailtable
    
    for i from 1 to N-1:
        if arr[i] < tailTable[0]:
            tailTable[0] = arr[i]
        else if arr[i] > tailTable[len - 1]:
            tailTable[len] = arr[i]
            len = len + 1
        else:
            Find index using binary search on tailTable for arr[i]
            if index < 0:
                index = -(index + 1)
            tailTable[index] = arr[i]
    
    Initialize subsequence as empty array
    
    for i from 0 to len - 1:
        Add tailTable[i] to subsequence
        
    Return subsequence

      */
     public static List findSubSequence(int arr [] ,int n){
          int[] tailTable = new int[n];
          int len = 1;
          tailTable[0] = arr[0];
  
          for (int i = 1; i < n; i++) {
              if (arr[i] < tailTable[0]) {
                  tailTable[0] = arr[i];
              } else if (arr[i] > tailTable[len - 1]) {
                  tailTable[len++] = arr[i];
              } else {
                  int index = Arrays.binarySearch(tailTable, 0, len, arr[i]);
                  if (index < 0) {
                      index = -(index + 1);
                  }
                  tailTable[index] = arr[i];
              }
          }
  
          List<Integer> subsequence = new ArrayList<>();
          for (int i = 0; i < len; i++) {
              subsequence.add(tailTable[i]);
          }
  
          return subsequence;
     }
}
