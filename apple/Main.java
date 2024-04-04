
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RealEstateManagementApp app = new RealEstateManagementApp(); // Create an instance of RealEstateManagementApp

        // Take input from user for adding maintenance records
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Real Estate Management Application =====");
            System.out.println("1. Add Maintenance Record");
            System.out.println("2. View All Maintenance Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter House Address: ");
                    String houseAddress = scanner.nextLine();
                    System.out.print("Enter Maintenance Type: ");
                    String maintenanceType = scanner.nextLine();
                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Date: ");
                    String date = scanner.nextLine();

                    MaintenanceRecord newRecord = new MaintenanceRecord(houseAddress, maintenanceType, description, date);
                    app.addMaintenanceRecord(newRecord);
                    System.out.println("Maintenance Record added successfully.");
                    break;
                case 2:
                    app.setVisible(true); // Display the maintenance records window
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
