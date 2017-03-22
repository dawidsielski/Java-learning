public class TelephoneNumber implements Comparable<TelephoneNumber>{
    private int countryCode;
    private int localNumber;
    public TelephoneNumber(){
    }
    public TelephoneNumber(int countryCode, int localNumber){
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }
    public String getFullNumber(){
        return "+" + this.countryCode + " " + this.localNumber;
    }
    public int compareTo(TelephoneNumber num){ // zwraca inta
        return 1;
    }
}