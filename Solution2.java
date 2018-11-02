import java.io.*;
import java.util.*;

public class Solution2 {
    
    static ArrayList<Integer> getDivisors(int n) 
    { 
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                if (n/i == i) 
                    divisors.add(i); 
                else {
                    divisors.add(i);
                    divisors.add(n/i);
                }
            } 
        }
        return divisors;
    } 
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        int [] arr = new int [input.length()];
        arr[0] = Integer.parseInt(input.charAt(0) + "");
        arr[1] = Integer.parseInt(input.charAt(1) + "");
        int bats = arr[1] == 1 ? 1 : 0;
        for(int i = 2; i < input.length(); i++){
            int expected = Integer.parseInt(input.charAt(i) + "");
            int sum = 0;
            for(int divisor : getDivisors(i)){
                    sum = (sum + arr[divisor]) % 2;
            }
            if(expected == sum){
                arr[i] = 0;
            } else {
                arr[i] = 1;
                bats ++;
            }
        }
        System.out.println(bats);
        
    }
}
