// input 121 = output 121

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a palindrome number");
        int num = scanner.nextInt();
        int remd,result=0;
        int c = num;
        while(num>0){
            remd = num%10;
            result = result*10+remd;
            num = num/10;
        }
        if (c == result) {
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not plaindrome");
        }
    }
}
