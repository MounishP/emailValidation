import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email address: ");
        String email = scanner.next();
        ArrayList<String> emails = new ArrayList<>();
        emails.add("mnsh.pv1@gmail.com");
        emails.add("mounishdarling91@gmail.com");
        emails.add("p.ravali@gmail.com");
        for (String em : emails) {
            if (email.equals(em)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (check) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
