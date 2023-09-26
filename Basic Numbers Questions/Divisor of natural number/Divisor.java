
public class Divisor {
     public static void printDivisor(int n){
          if(n < 0){
               System.out.println("not a positive number");
          }
          else{
               for(int i=1;i<=n;i++){
                    if(n % i == 0 ){
                         System.out.print(i +" ");
                    }  
               }
          }
     }
     public static void main(String[] args) {
          int num = 36;
          printDivisor(num);

     }
}
