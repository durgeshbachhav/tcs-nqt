
public class Replace {
     //builtin function solution
     public static String change(int n){
          String str = n + "";
          return str.replace('0', '5');
     }
     // user define function solution
     public static int reverseTheNum(int temp){
          int ans = 0;
          while(temp > 0){
               int lastdigit = temp % 10;
               ans = ans * 10 + lastdigit;
               temp /=10;
               
          }
          return ans;
     }
     public static int replaceZero(int n){
        
          if(n==0){
               return 5;
          }
          else{
                 int temp = 0;
               while(n>0){
               int lastdigit = n%10;
               if(lastdigit == 0 ){
                    lastdigit=5;
               }
               temp = temp * 10 + lastdigit;
               n/=10;
          }
          return reverseTheNum(temp);
          }
     }
     public static void main(String[] args) {
          
          int n =209100680;
          System.out.println(change(n));
     }
}
