

public class Ps {
     public static boolean perfectSquare(int n){
          if(n == 0 || n== 1){
               return true;
          }
          //using binary search
          int left = 1;
          int right = n/2;

          while (left <= right){
               int mid = left + (right - left)/2;
               int square = mid * mid;

               if(square == n){
                    return true;
               }else if(square < n){
                    left = mid + 1;
               }else{
                    right = mid - 1;
               }
          }
          return false;
     }
     public static void main(String[] args) {

          int num = 245;
          boolean result = perfectSquare(num);
          System.out.println("Is " +num+ " a Perfect Square? "+result);
          

     }
}
