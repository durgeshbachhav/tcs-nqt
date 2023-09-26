public class Armstrong {
     public static boolean checkArmstrong(int n) {
          int sum = 0;
          int temp = n;
          int numDigits = String.valueOf(n).length(); // Calculate the total number of digits in the number

          while (n > 0) {
               int ld = n % 10;
               sum += Math.pow(ld, numDigits); // Raise each digit to the power of total digits
               n /= 10;
          }

          if (sum == temp) {
               return true;
          }
          return false;
     }

     public static void main(String[] args) {
          int n = 474;
          System.out.println(checkArmstrong(n));
     }
}
