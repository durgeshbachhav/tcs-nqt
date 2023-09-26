import java.util.HashSet;

public class Hn {
     public static boolean happyNumber(int n){
          HashSet<Integer> visitedNumbers = new HashSet<>();

          while(n != 1 && !visitedNumbers.contains(n)){
               visitedNumbers.add(n);
               n=getNextNumber(n);
          }
          return n==1;
     }
     public static int getNextNumber(int n){
          int sum = 0;
          while(n>0){
               int rem = n % 10;
               sum += rem*rem;
               n/=10;
          }
          return sum;
     }
     public static void main(String[] args) {
          int n = 4;
          System.out.println(happyNumber(n));
     }
}
