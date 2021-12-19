package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        try{
            int number = Integer.parseInt(br.readLine());
            Palindrome p = new Palindrome(number);
            if(p.checkPalindrome(p)){
                System.out.println(number + " is Palindrome!");
            }
            else {
                System.out.println(number + " is not Palindrome!");
            }
        }catch (IOException e){
            System.out.println("Failed to parse input to Integer: "+e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Input is not number: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Default exception:" +e.getMessage());
        }
    }
}
