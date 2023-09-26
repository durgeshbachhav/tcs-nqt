
public class Remove {
     
     public static void main(String[] args) {
          String str = "computer";
          String str1 = "cot";
          System.out.println(removeChars(str, str1));

     }
     

     public static String removeChars(String str1, String str2){

          boolean[] charPresent = new boolean[26];
          
          for(int i=0;i<str2.length();i++){
               charPresent[str2.charAt(i)-'a']=true;
          }

          StringBuilder sb = new StringBuilder();
          for(int i=0;i<str1.length();i++){
               if(!charPresent[(str1.charAt(i))-'a'] ){
                    sb.append(str1.charAt(i));
               }
          }
          return sb.toString();
     }
}
