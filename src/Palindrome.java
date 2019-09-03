import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        StringBuilder name1 = new StringBuilder();
        name1.append(name);
        name1 = name1.reverse();

        if (name1.equals(name)) {
            System.out.println("The name is palendrome");
        } else {
            System.out.println("The name is not palendrome");
        }
        System.out.println("The name entered is " + name);
        System.out.println("The reverse name is" + name1);
        // this is incomplete palindrome program.
    }
}
