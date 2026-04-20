package collections;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.get;

public class hashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hp=new HashMap();
        hp.put(101,"hia");
        hp.put(102,"priya");
        hp.put(103,"anna");
        hp.put(104,"kapa");
        hp.put(105,"jiaa");

        System.out.println(hp);

        System.out.println(hp.containsKey(105));
        System.out.println(hp.containsValue("ha"));

        System.out.println(hp.get(103));
        System.out.println(hp.keySet());
        System.out.println(hp.values());
        System.out.println(hp.entrySet());

        for(Object i:hp.keySet()){
            System.out.println(i+"  "+hp.get(i));
        }
        for(Map.Entry ent:hp.entrySet()){
            System.out.println(ent.getKey()+"   "+ent.getValue());
        }
    }
}
