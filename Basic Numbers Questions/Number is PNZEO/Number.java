
public class Number {
     public static void checkNum(int num){
          if(num > 0){
               System.out.println("positive number");
          }
          else if(num < 0 ){
               System.out.println("negative number");
          } 
          else{
               System.out.println("number is zero");
          }

          //check even odd

          if(num % 2 == 0 ){
               System.out.println("number is even");
          } else {
               System.out.println("number is even");
          }

     }
     public static void main (String[] args){

          int num = -13;
          checkNum(num);

     }
     
}
