import java.util.Scanner;

public class HomePage{
    public void showMenu() {
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("\nWelcome to UPI Banking App");
        System.out.println("1. Create Account");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Redirecting to Create Account...");
                break;
            case 2:
                System.out.println("Redirecting to Login...");
                break;
            case 3:
                System.out.println("Thank you for using UPI Banking App!");
                sc.close(); // ✅ close before exit
                return;     // exit loop & program
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
}