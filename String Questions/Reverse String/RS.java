import java.util.*;

public class RS {
     public static void main(String[] args) {
          
          String str = "hellow everyone what's up!";
          //first way
          System.out.println(Sbuffer(str));
          //third way
          System.out.println(iteration(str));

     }
     public static String Sbuffer(String str){
          StringBuilder sb = new StringBuilder(str);
          return  sb.reverse().toString();
     }

     // public static String Sformatter(String str){
          // System.out.println(StringFormatter.reverseString(str));
     // }

     public static String iteration(String str){
          char[] ch = str.toCharArray();
          String rev = "";
          for(int i = ch.length-1;i>=0;i--){
               rev+=ch[i];
          }
          return rev;
     }
}
