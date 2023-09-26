
public class pl {
     public static void main(String[] args) {
          
          String name = "nayatan";
          System.out.println("Is Palindrome: "+checkPalindrome(name));
          System.out.println("Is Palindrome: "+checkPalindromeInBuild(name));

     }
     public static boolean checkPalindrome(String str){
          String lstr = str.toLowerCase();
          int left = 0;
          int right = lstr.length()-1;

          while(left < right){
               if(lstr.charAt(left) != lstr.charAt(right)){
                    return false;
               }
               else{
                    left++;
                    right--;
               }
          }
          return true;
     }

     public static boolean checkPalindromeInBuild(String str){
          StringBuilder sb = new StringBuilder(str);

          sb.reverse();

          if(sb.equals(str)) return true;
          else return false;
     }
}
