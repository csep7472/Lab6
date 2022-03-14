import java.util.Objects;
import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int x = input.nextInt();
        System.out.println("Enter your second number: ");
        int y = input.nextInt();
        System.out.println("Add or Subtract?");
        String choice = input.next();
        int total;
        if (Objects.equals(choice, "add")) {
            total = x + y;
        } else{
            total = x - y;
        }
        System.out.println(total);
    }
}
