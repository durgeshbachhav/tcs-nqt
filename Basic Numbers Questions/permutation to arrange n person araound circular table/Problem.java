

public class Problem {
      public static int permutation(int n){

          int result = 1;
          while(n>0){
               result = result * n;
               n--;
          }
          return result;
      }
     public static void main(String[] args) {
          int n =4;
          System.out.println("Permutation of "+n+" is: " +permutation(n-1));

     }
}
