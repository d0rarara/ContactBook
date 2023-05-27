import java.util.List;
import java.util.Scanner;

public class ContactBookProgram {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add a contact");
            System.out.println("2. Delete a contact");
            System.out.println("3. Search contacts by name");
            System.out.println("4. Search contacts by phone number");
            System.out.println("5. Search contacts by email");
            System.out.println("6. Display all contacts");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber, email);
                    contactBook.addContact(newContact);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.print("Enter the name of the contact to delete: ");
                    String contactName = scanner.nextLine();
                    List<Contact> matchingContacts = contactBook.searchByName(contactName);
                    if (matchingContacts.isEmpty()) {
                        System.out.println("Contact not found!");
                    } else if (matchingContacts.size() == 1) {
                        Contact contactToDelete = matchingContacts.get(0);
                        contactBook.deleteContact(contactToDelete);
                        System.out.println("Contact deleted successfully!");
                    } else {
                        System.out.println("Multiple contacts found with the same name. Please provide additional information.");
                        // Handle the case where multiple contacts have the same name
                    }
                    break;
                case 3:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.nextLine();
                    List<Contact> contactsByName = contactBook.searchByName(searchName);
                    if (contactsByName.isEmpty()) {
                        System.out.println("No contacts found with the given name.");
                    } else {
                        System.out.println("Matching contacts:");
                        for (Contact contact : contactsByName) {
                            System.out.println(contact);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter the phone number to search: ");
                    String searchPhoneNumber = scanner.nextLine();
                    List<Contact> contactsByPhoneNumber = contactBook.searchByPhoneNumber(searchPhoneNumber);
                    if (contactsByPhoneNumber.isEmpty()) {
                        System.out.println("No contacts found with the given phone number.");
                    } else {
                        System.out.println("Matching contacts:");
                        for (Contact contact : contactsByPhoneNumber) {
                            System.out.println(contact);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter the email to search: ");
                    String searchEmail = scanner.nextLine();
                    List<Contact> contactsByEmail = contactBook.searchByEmail(searchEmail);
                    if (contactsByEmail.isEmpty()) {
                        System.out.println("No contacts found with the given email.");
                    } else {
                        System.out.println("Matching contacts:");
                        for (Contact contact : contactsByEmail) {
                            System.out.println(contact);
                        }
                    }
                    break;
                case 6:
                    System.out.println("All contacts:");
                    contactBook.displayContacts();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    scanner.close();
                default:
                    System.out.println("Invalid choice. Please try again.");
                    scanner.close();
                    break;

            }
            //scanner.close();
            System.out.println();
        }
    }
}
