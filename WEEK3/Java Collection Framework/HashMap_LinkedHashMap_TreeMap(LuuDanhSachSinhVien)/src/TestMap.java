import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("Nam",30);
        hashMap.put("Luat",27);
        hashMap.put("Tien",26);
        hashMap.put("Hoa",20);
        hashMap.put("Long",32);
        hashMap.put("Quang",19);
        System.out.println("Display entries in HashMap ");
        System.out.println(hashMap +" \n");
        System.out.println("***************************");
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        System.out.println("***************************");
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Nam",30);
        linkedHashMap.put("Luat",27);
        linkedHashMap.put("Tien",26);
        linkedHashMap.put("Hoa",20);
        linkedHashMap.put("Long",32);
        linkedHashMap.put("Quang",19);
        System.out.println("\nThe age for Long is "+linkedHashMap.get("Long"));
    }

}
