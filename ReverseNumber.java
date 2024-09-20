// input 456 = output 654

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter a number: ");
        int num = scanner.nextInt();
        int result =0;
        while (num != 0) {
            int remd = num%10;
            result = result*10 + remd;
            num = num/10; 
        }

        System.out.println("resverse no is "+ result);
    }
}
