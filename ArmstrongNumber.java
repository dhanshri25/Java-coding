import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number :");
        int num = scanner.nextInt();
        int n =0,c , rem,arm =0;
        n = num;
        c = n;
        while (n>0) {
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n = n/10;
        }
        if(num==arm){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it is not armstrong number");
        }
    }

}
