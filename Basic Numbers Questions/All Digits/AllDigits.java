

public class AllDigits {
     public static int getdigitall(int n){
          while(n>9){
               int sum = 0; 
               while(n !=0){
                    sum += n % 10;
                    n/=10;

               }
               n = sum;
          }
          
          return n;
     }
     public static void main(String[] args) {
          
          int n = 99;
          int result  = getdigitall(n);
          System.out.println(result);

     }
}
