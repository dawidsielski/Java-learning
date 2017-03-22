public class Person extends TelephoneEntry{
    private String firstName;
    private String lastName;
    private String address;
    public Person(){
        this.firstName = new String("Jan");
        this.lastName = new String("Nowak");
        this.address = new String("Skosna 54/234");
        this.telephoneNumber = new TelephoneNumber(48,123456789);
    }
    public Person(String firstName, String lastName, String address, TelephoneNumber telephoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }
    public String description(){
        return (this.firstName + " " + this.lastName + " " + " Address: " + this.address);
    }
}