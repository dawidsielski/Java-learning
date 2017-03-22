public class Company extends TelephoneEntry{
    private String name;
    private String address;

    public Company(){
    }
    public Company(String name, String address, TelephoneNumber telephoneNumber){
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }
    public String description(){
        return ("Name: " + this.name + " Address: " + this.address);
    }
}