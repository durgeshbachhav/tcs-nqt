

public class Hex {
     public static String converthex(int n){
          if(n < 0 ){
               return "0";
               
          }

          // this is inbuild function to convert number to hex
          // String hex = Integer.toHexString((Integer)(Math.abs(n)));

          //but we want to create user defined function
          //create hex array to store value
          char hexarray[]="0123456789abcdef".toCharArray();

          //create string builder to store string

          StringBuilder sb = new StringBuilder();

          while(n>0){
               int remainder = n % 16;
               sb.append(hexarray[remainder]);
               n/=16;
          }
          sb.reverse();
          return sb.toString();
     }
     public static void main(String[] args) {

          int n = -1;
          String result = converthex(n);

          System.out.println("number in hex form is : "+result);
          
     }
     
}
