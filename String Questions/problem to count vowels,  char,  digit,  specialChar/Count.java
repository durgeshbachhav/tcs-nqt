
public class Count {
     public static void main(String[] args) {
          String str = " abac@ Eniklslfa12";
          getCount(str);
     }
     
     public static void getCount(String str){

          int vowels=0, consonant=0, specialChar=0, digit = 0;

          for(int i=0;i<str.length();i++){
               char ch = str.charAt(i);
               if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                    //convert this char into lowercase for checking it is vowels or not
                    if(ch=='a' || ch=='o' || ch=='u' || ch=='i' | ch=='e'){
                         vowels++;
                    }else{
                         consonant++;
                    }
               }
               else{
                    if(ch>='0' && ch<='9'){
                         digit++;
                    }else{
                         specialChar++;
                    }
               }
          }
          System.out.println("vowels : "+ vowels);
          System.out.println("consonant : "+ consonant);
          System.out.println("digit : "+ digit);
          System.out.println("specialChar : "+ specialChar);
     }
}
