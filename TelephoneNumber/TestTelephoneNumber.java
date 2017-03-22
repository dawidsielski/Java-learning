import java.util.*;
public class TestTelephoneNumber{
    public static void main(String[] args){
        TreeMap<TelephoneNumber,TelephoneEntry> treeMap = new TreeMap<TelephoneNumber,TelephoneEntry>();

        Person p1 = new Person();
        Person p2 = new Person("Dawid", "Sielski","lsdkfjsldjkf", new TelephoneNumber(34,234567));

        Company c1 = new Company("Dupek", "address", new TelephoneNumber(90,2567));

        treeMap.put(p1.getTelephoneNumber(), p1);
        treeMap.put(p2.getTelephoneNumber(), p2);
        treeMap.put(c1.getTelephoneNumber(), c1);

        // for(Map.Entry<TelephoneNumber,TelephoneEntry> entry : treeMap.entrySet()) {
        //     TelephoneNumber key = entry.getKey();
        //     TelephoneEntry value = entry.getValue();

        //     System.out.println(key.getFullNumber() + " => " + value.description());
        // }


        Set set = treeMap.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
        Map.Entry me = (Map.Entry)it.next();
            System.out.print("Key is: "+ ((TelephoneNumber)me.getKey()).getFullNumber() + " & ");
            System.out.println("Value is: "+ ((TelephoneEntry)me.getValue()).description());
        } 
    }
}