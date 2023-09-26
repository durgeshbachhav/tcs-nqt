
public class Fib {
     public static void fibSquence(int n){
          int a =0, b=1,c;
          if(n == 0){
               System.out.print(a);
          }
          System.out.print(a+" "+b);
          for(int i=2;i<=n;i++){
               c=a+b;
               a=b;
               b=c;
               System.out.print(" "+b+" ");
          }
     }

     public static void main(String[] args) {
          
          int n = 5;
          fibSquence(n);

     }
}
