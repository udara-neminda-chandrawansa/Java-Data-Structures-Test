import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class DataStructuresTest {
    
    public static ArrayList<String> AL = new ArrayList<>();
    public static HashMap<String, Integer> HM = new HashMap<>();
    public static LinkedList<String> LL = new LinkedList<>();

    public static void main(String[] args) {
        AL.add("Array List Test");
        HM.put("User ID",1101011);
        LL.push("Linked List Test");

        System.out.println(AL.get(0));
        System.out.println(HM.get("User ID"));
        System.out.println(LL.get(0));
    }
    
}
