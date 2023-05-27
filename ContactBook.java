//Dori Kumbu 
//May 27th

import java.util.ArrayList;
import java.util.List;

/**
 * The ContactBook class is a Java program that allows users to add, delete, search, and display
 * contacts in a list.
 */
public class ContactBook {
    private List<Contact> contacts;

    /**
     * Constructor 
     */
    public ContactBook() {
        contacts = new ArrayList<>();
    }

   /**
    * The function adds a contact to a list of contacts.
    * 
    * @param contact The parameter "contact" is an object of the class "Contact". It is being passed as
    * an argument to the method "addContact". The method adds this contact object to a list of contacts
    * called "contacts".
    */
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    /**
     * This Java function deletes a contact from a list of contacts.
     * 
     * @param contact The parameter "contact" is an object of the class "Contact". It represents the
     * contact that needs to be deleted from the list of contacts. The method "deleteContact" removes
     * this contact from the list.
     */
    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

   /**
    * This Java function searches for contacts by name and returns a list of matching results.
    * 
    * @param name The parameter "name" is a String that represents the name of the contact being
    * searched for. The method searches through a list of Contact objects and returns a list of all
    * contacts that have a name that matches the input name (ignoring case).
    * @return The method is returning a list of contacts that match the input name.
    */
    public List<Contact> searchByName(String name) {
        List<Contact> searchResults = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                searchResults.add(contact);
            }
        }
        return searchResults;
    }

    /**
     * The function searches for contacts in a list by their phone number and returns a list of
     * matching contacts.
     * 
     * @param phoneNumber The parameter "phoneNumber" is a String that represents the phone number that
     * we want to search for in the list of contacts.
     * @return The method is returning a list of contacts that match the given phone number.
     */
    public List<Contact> searchByPhoneNumber(String phoneNumber) {
        List<Contact> searchResults = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                searchResults.add(contact);
            }
        }
        return searchResults;
    }

    /**
     * The function searches for contacts in a list by email and returns a list of matching contacts.
     * 
     * @param email The email parameter is a String that represents the email address to search for in
     * the list of contacts. The method searches through the list of contacts and returns a list of all
     * contacts that have a matching email address.
     * @return The method is returning a list of contacts that match the email parameter.
     */
    public List<Contact> searchByEmail(String email) {
        List<Contact> searchResults = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getEmail().equalsIgnoreCase(email)) {
                searchResults.add(contact);
            }
        }
        return searchResults;
    }

    /**
     * This function displays all the contacts in an array of Contact objects.
     */
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
