import java.util.*;

public class Cc{

     public static void main(String[] args) {
          
          String str1 = "nikhil";
          String str3 = "nikkhil";
          System.out.println(commonChar(str1, str3));
          
     }
     public static String commonChar(String str1, String str2 ) {
          StringBuilder commonStr = new StringBuilder();
          

          if(str1.length() > 0 && str2.length() > 0){
               String tobeiterated = (str1.length()> str2.length())?str2:str1;

               String tobeChecked = tobeiterated.equals(str1)? str2:str1;

               System.out.println("iterate " + tobeiterated);
               System.out.println("checked " +tobeChecked);

               for(int i=0;i<tobeiterated.length();i++){
                    if(tobeChecked.contains(Character.toString(tobeiterated.charAt(i)))){
                         commonStr.append(Character.toString(tobeiterated.charAt(i)));
                    }
               }
               return commonStr.toString();
          }
          else{
               return "";
          }
     }
     // public static String commonChar1(String str1, String str2 ) {
     //      StringBuilder commonStr = new StringBuilder();
     //      List<Character> one = new ArrayList<>();
     //      List<Character> two = new ArrayList<>();

          
     // }
}