import java.io.*;
import java.util.Scanner;

public class prefi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Register");
        System.out.println("2. Login");
        int option = scanner.nextInt();

        if (option == 1) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a username (alphanumeric only): ");
            String username = input.next();
            System.out.print("Enter a password (alphanumeric only): ");
            String password = input.next();

            try (PrintWriter out = new PrintWriter(new FileWriter("records.txt", true))) {
                out.println(username + ":" + password);
                System.out.println("Successfully registered!");
            } catch (IOException e) {
                System.out.println("Error writing to file.");
            }
        } else if (option == 2) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a username (alphanumeric only): ");
            String username = input.next();
            System.out.print("Enter a password (alphanumeric only): ");
            String password = input.next();

            try (Scanner file = new Scanner(new File("records.txt"))) {
                boolean found = false;
                while (file.hasNextLine()) {
                    String line = file.nextLine();
                    String[] parts = line.split(":");
                    if (parts[0].equals(username) && parts[1].equals(password)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    System.out.println("Successfully logged in!");
                } else {
                    System.out.println("Incorrect username or password.");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error reading from file.");
            }
        }
    }
}
