import java.util.HashMap;

public class Dup {

     public static void main(String[] args){
          String str = "geeksforgeeks";
          DuplicateString(str);

     }

     public static void DuplicateString(String str){

          HashMap<Character, Integer > hm = new HashMap<>();

          for(char ch:str.toCharArray()){
               if(hm.containsKey(ch)){
                    hm.put(ch, hm.get(ch)+1);
               }else{
                    hm.put(ch,1);
               }
          }

          for(HashMap.Entry<Character, Integer> entry : hm.entrySet()){
               if(entry.getValue() >  1){
                    System.out.println(entry.getKey()+" "+entry.getValue());
               }
          }
     }
     
}
