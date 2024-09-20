// 5 = 1*2*3*4*5 =120
import java.util.Scanner;

public class Factorialnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a factorial number :");
        int num = scanner.nextInt();

        long factorial = 1;
        for(int i=1;i<=num;i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial of number is " + factorial);
    }
}
