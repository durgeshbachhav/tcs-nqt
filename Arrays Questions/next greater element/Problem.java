import java.util.Arrays;
import java.util.Stack;

public class Problem {
     public static void main(String[] args) {
          
          int arr[]={1,3,2,4};
          int n = arr.length;
          System.out.println(Arrays.toString(greaterNextElem(arr, n)));
     }

     public static int[] greaterNextElem(int arr[],int n){
          Stack <Integer> stack = new Stack<>();
          int temp[]=new int[n];

          for(int i =0;i<n;i++){
               while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
               //pop the element from stack and store it in temp array
               int prevIndex = stack.pop();
               temp[prevIndex]=arr[i];
               
               }
               stack.push(i);
          }

          while(!stack.isEmpty()){
               int prevIndex = stack.pop();
               temp[prevIndex]=-1;
          }
          return temp;
     }
}
               /*

                    explanation
               * Humne ek stack banaya jismein hum indexes store karenge, aur ek result array banaya jismein hum next greater elements store karenge.
               Loop chalaya 0 se N-1 tak:
               Agar stack khali nahi hai aur arr[i] bada hai stack ka top element, toh hum stack se elements pop karte rahenge jab tak ye conditions satisfy hoti hain:
               Pop karte samay pop kiya hua element ka index 'prevIndex' hoga, iska matlab ye element arr[i] ke next greater element hai.
               Isliye result[prevIndex] ko set karte hain as arr[i].
               Fir hum i ko stack mein push karte hain, taki hum uska next greater element dhund sake.
               Loop khatam hone ke baad, jo bhi elements stack mein bach gaye hain unka next greater element nahi hai, toh unka result[i] ko set karte hain as -1.
               Is solution mein humne ek stack ka istemal kiya hai jo indexes store karta hai. Loop chalate waqt hum stack ko usi tarah use karte hain jaise hum next greater element dhoondte hain. Loop khatam hone ke baad, jo bhi elements stack mein bach jate hain, unka next greater element nahi hota, isliye unko -1 se mark kar diya jata hai.
               */