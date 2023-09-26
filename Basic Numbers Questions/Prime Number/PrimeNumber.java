
public class PrimeNumber {

     public static boolean checkprime(int n){

          int counter = 0;
          for(int i=1;i<=n;i++){
               if(n % i == 0){
                    counter++;
               }
          }


          if(counter==2){
               return true;
          }
          else{
               return false;
          }
     }
     
     public static void main(String[] args){

          int num = 4;
          System.out.println(checkprime(num));


     }
}
