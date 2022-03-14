import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int x = input.nextInt();
        System.out.println("Enter your second number: ");
        int y = input.nextInt();
        int total = x + y;
        System.out.println(total);
    }
}
