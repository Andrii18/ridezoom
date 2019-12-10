package ridezum;

public class Client {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String state;
    private String zipCode;

    public Client(String firstName, String lastName, String email, String phone,
                  String state, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.state =state;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getState() {
        return state;
    }
    public String getZipCode() {
        return zipCode;
    }

}