package Geeks;
import java.util.Scanner;
class User {
    private String name;
    private double amount;
    private String passcode;

    public User(String name, String passcode, double amount) {
        this.name = name;
        this.passcode = passcode;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getPasscode() {
        return passcode;
    }
}

class Registration {
    public static User register() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("___________ Welcome to Registration Page _________\n\n");
            System.out.println("Enter your full name: ");
            String name = scanner.nextLine();

            System.out.println("Enter your passcode: ");
            String passcode = scanner.nextLine();

            System.out.println("Confirm your password: ");
            String confirm = scanner.nextLine();

            if (!confirm.equals(passcode)) {
                System.out.println("Passwords do not match.");
                return null;
            }

            System.out.println("Enter your amount: ");
            double amount = scanner.nextDouble();

            return new User(name, passcode, amount);
        } catch (Exception e) {
            System.out.println("Error occurred during registration: " + e.getMessage());
            return null;
        }
    }
}

class UserOperations {
    public static void displayUserInfo(User user) {
        if (user != null) {
            System.out.println(" ____________ Information about you ____________\n\n");
            System.out.println("\t Name : " + user.getName());
            System.out.println("\t Balance : " + user.getAmount());
        } else {
            System.out.println("User information not available.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("\u001b[H\u001b[2J");
            while (true) {
                System.out.println("\t1. To see information about you");
                System.out.println("\t2. For new user");
                System.out.println("\t3. To exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        User user = Registration.register();
                        UserOperations.displayUserInfo(user);
                        break;
                    case 2:
                        User newUser = Registration.register();
                        UserOperations.displayUserInfo(newUser);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } finally {
            scanner.close();
        }
    }
}