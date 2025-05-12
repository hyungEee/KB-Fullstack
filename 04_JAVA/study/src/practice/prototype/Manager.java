package practice.prototype;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Manager {

    Map<String,Product> showcase=new HashMap<>();

    void register(String name, Product p){
        showcase.put(name, p);
    }

    Product create(String name){
        Product p=showcase.get(name);
        return p.createCopy();
    }

    void printRegisterdStyles(){
        System.out.println("[등록된 스타일 목록]");
        Iterator<Map.Entry<String,Product>> it=showcase.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Product> entrySet = it.next();
            System.out.println("- "+entrySet.getKey()+" : "+entrySet.getValue().toString());
        }
        System.out.println();
    }
}
