import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers :");

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("Before swapping :" + a + " " + b);

        temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping :" + a + " " + b);

    }
}
