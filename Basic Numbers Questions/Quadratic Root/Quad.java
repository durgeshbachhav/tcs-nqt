import static java.lang.Math.*;

public class Quad {
      static void quadratic_eq(int a,int b, int c){
          if(a==0){
               System.out.println("invalid");
               return;
          }
          int d = (b*b)-4*a*c;
          double sqrt_value = sqrt(abs(d));
          

          if(d>0){
               System.out.println("root are real and different");
               System.out.println((double)(-b+ sqrt_value)/( 2 * a)+ "\n" + (double)(-b - sqrt_value)/(2 * a));
          }
          else if(d==0){
               System.out.println("root are real and same");
               System.out.println(-(double)b/(2*a)+"\n"+ -(double)b/(2*a));
          }else{
               System.out.println("root are complex");
               System.out.println(-(double) b/(2*a) + "+ i" + sqrt_value /(2*a)+"\n" 
               + -(double)b/(2*a)
               + " -i"
               +sqrt_value / ( 2* a)
               );
          }

     }
     public static void main(String[] args) {
          int a = 1 , b = -7, c =12;
          quadratic_eq(a, b, c);
     }
}
