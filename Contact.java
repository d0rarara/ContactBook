//Dori Kumbu 
//May 27th

public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    /**
     * This is a constructor method for the 'Contact' class that takes in three parameters: 'name',
     * 'phoneNumber', and 'email'. 
     * 
     * This constructor is used to create new 'Contact' objects with the specified name, phone number, and email.
     * 
     * @param name
     * @param phoneNumber
     * @param email
     */
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and setters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Phone: " + phoneNumber + "\n" +
               "Email: " + email + "\n";
    }
}
