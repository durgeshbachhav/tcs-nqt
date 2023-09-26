import java.util.HashMap;

public class Diff {
     public static void main(String[] args) {
          
          String str1 = "hello";
          String str2 = "hellow";
          System.out.println(getDiff(str1, str2));
     }
     public static char getDiff(String str1, String str2){
          //create hashmap
          HashMap <Character,Integer> hm = new HashMap<>();

          for(char c: str1.toCharArray()){
               hm.put(c,hm.getOrDefault(c,0)+1);
          }

          for(char c: str2.toCharArray()){
               hm.put(c,hm.get(c)-1);
          }
          for(char c: hm.keySet()){
                if(hm.get(c)==1){
                    return c;
                }
          }
          return ' ';
     }
}
