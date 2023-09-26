public class ClimbingStairs{

     public static int wayoftop(int n){
          if(n<=1){
               return 1;
          }
          int storingWays[] = new int [n+1];
          storingWays[0]=storingWays[1]=1;
          for(int i=2;i<=n;i++){
               storingWays[i]=storingWays[i-1]+storingWays[i-2];
          }
          return storingWays[n];
     }
     public static void main(String[] args) {
          //n == no 0f stairs
          int n = 5;
          int result= wayoftop(n);
          System.out.println("total way to climb a top : "+result);
     }
}