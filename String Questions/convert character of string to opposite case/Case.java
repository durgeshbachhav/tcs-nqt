
public class Case {
     public static void main(String[] args) {
          
          StringBuffer str =new StringBuffer("Hellow oWorld") ;
          changeCase(str);
          System.out.println(str);
                    
          


     }
     public static StringBuffer changeCase(StringBuffer str){
         int n = str.length();

         for(int i=0;i<n;i++){
          Character c = str.charAt(i);
          if(Character.isLowerCase(c)){
               str.replace(i, i+1,Character.isUpperCase(c)+"");
          }else{
                str.replace(i, i+1,Character.isLowerCase(c)+"");
          }
         }
         return str;
     }
}
