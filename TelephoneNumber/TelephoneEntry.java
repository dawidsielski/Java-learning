public abstract class TelephoneEntry{
    protected TelephoneNumber telephoneNumber;

    public TelephoneEntry(TelephoneNumber telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
    public TelephoneEntry(){
        this.telephoneNumber = new TelephoneNumber();
    }
    public TelephoneNumber getTelephoneNumber(){
        return this.telephoneNumber;
    }
    public abstract String description();
}