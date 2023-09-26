import java.security.PublicKey;

public class Excel {
     public static void main(String[] args) {
          
          String str = "AB";
          System.out.println("Excel sheet number is "+Excelsheet(str));

     }
     public static int Excelsheet(String str){
          int ans =0;
          for(char ch:str.toCharArray()){
               ans= ans * 26 +(ch-'A'+1);
          }
          return ans;
     }
}
