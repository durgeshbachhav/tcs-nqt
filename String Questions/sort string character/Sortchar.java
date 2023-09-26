import java.util.*;

public class Sortchar {
     public static String Sorting(String str){

          char arr[]= str.toCharArray();
          Arrays.sort(arr);
          return String.valueOf(arr);

     }

     public static void main(String[] args) {
          String str = "wwelfjdslhslessle";
          System.out.println(Sorting(str));


     }
}
