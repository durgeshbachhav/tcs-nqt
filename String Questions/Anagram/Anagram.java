import java.util.Arrays;

public class Anagram {
     public static void main(String[] args){

          String str1 = "asdf";
          String str2 = "afds";

          System.out.println(checkIfAnagram(str1, str2));

     }
     public static boolean checkIfAnagram(String str1 , String str2){
          if(str1.length() != str2.length()){
               return false;
          }

          str1 = str1.toLowerCase();
          str2 = str2.toLowerCase();

          char arr1[]= str1.toCharArray();
          char arr2[]= str2.toCharArray();
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          
          return Arrays.equals(arr1, arr2);
          
     }
}
