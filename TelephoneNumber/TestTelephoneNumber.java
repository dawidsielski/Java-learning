import java.util.*;
public class TestTelephoneNumber{
    public static void main(String[] args){
        TreeMap<TelephoneNumber,TelephoneEntry> treeMap = new TreeMap<TelephoneNumber,TelephoneEntry>();

        Person p1 = new Person();
        Person p2 = new Person("Dawid", "Sielski","lsdkfjsldjkf", new TelephoneNumber(34,234567));

        Company c1 = new Company("Polfarma", "Wilesna 1/1", new TelephoneNumber(90,2567));

        treeMap.put(p1.getTelephoneNumber(), p1);
        treeMap.put(p2.getTelephoneNumber(), p2);
        treeMap.put(c1.getTelephoneNumber(), c1);

        Set<Map.Entry<TelephoneNumber,TelephoneEntry>> set = treeMap.entrySet();
        Iterator<Map.Entry<TelephoneNumber,TelephoneEntry>> it = set.iterator();

        while(it.hasNext()) {
        Map.Entry<TelephoneNumber,TelephoneEntry> me = it.next();
            System.out.print("Key is: "+ me.getKey().getFullNumber() + " & ");
            System.out.println("Value is: "+ me.getValue().description());
        } 
    }
}