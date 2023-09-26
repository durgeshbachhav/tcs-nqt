

public class Cs {
     public static void main(String[] args) {
          String str1 = "asdsf";
          String str2 = "dlske";

          System.out.println(commonSeq(str1, str2));

     }
     public static int commonSeq(String str1, String str2){
          int n1 = str1.length();
          int n2 = str2.length();

          int dp[][]=new int[n1 +1] [n2+ 1];

          char ch1,ch2;

          for(int i=0;i<=n1;i++){
               for(int j=0;j<=n2;j++){
                    dp[i][j]=0;
               }
          }

          for(int i=1;i<=n1;i++){
               for(int j=1;j<=n2;j++){
                    ch1 = str1.charAt(i-1);
                    ch2 = str2.charAt(j - 1);


                    if(ch1 == ch2){
                         dp[i][j] = 1 + dp[i][j-1]+dp[i-1][j];
                    }else{
                         dp[i][j] = dp[i][j-1]+dp[i-1][j] - dp[i-1][j-1];
                    }
               }
          }
          return dp[n1][n2];
     }
}
