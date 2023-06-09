import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        System.out.print("Enter the inventory item name: ");
                        String item = scanner.nextLine();

                        System.out.print("Enter the quantity to be add: ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        inventory.addItem(item, quantity);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Quantity format. Please Enter a valid integer.");
                    }
                    break;
                case "2":
                    try {
                        System.out.print("Enter the inventory item name: ");
                        String itemToRemove = scanner.nextLine();
                        System.out.print("Enter the number of quantity to remove: ");
                        int quantityToRemove = Integer.parseInt(scanner.nextLine());
                        inventory.removeItem(itemToRemove, quantityToRemove);
                    } catch (NumberFormatException e) //EXCEPTION
                    {
                        System.out.println("Invalid Quantity format. Please Enter a valid integer.");
                    }
                    break;
                case "3":
                    System.out.print("Enter the item name: ");
                    String itemToCheck = scanner.nextLine();
                    System.out.println("Quantity of " + itemToCheck + " in the inventory: " + inventory.checkQuantity(itemToCheck));
                    break;
                case "4":
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("\t--------------------\t");
        System.out.println("\tInventory Management\t");
        System.out.println("\t--------------------\t");
        System.out.println("1. Add item to the Inventory");
        System.out.println("2. Remove item or quantity from the Inventory");
        System.out.println("3. Check item quantity in the Inventory");
        System.out.println("4. Exit");
        System.out.print("\t\tEnter your choice:");

    }
}
