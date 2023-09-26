

public class LeapYear {

     public static boolean CheckLeapYear(int year){

          if(year % 4 ==0 ){

               if(year % 100 ==0 && year % 400!= 0){
                    return false;
               }

               return true;
          }

          return false;
     }
     public static void main(String[] args){

          int yr = 2029;

          if(CheckLeapYear(yr)){
               System.out.println("it is leap year");
          }else{
               System.out.println("it is not leap year");
          }

     }
}
