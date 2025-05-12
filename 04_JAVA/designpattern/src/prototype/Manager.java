package prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String,Product> showcase=new HashMap<>();

    public void register(String name, Product prototype){  // 원본 등록
        showcase.put(name,prototype);
    }

    // 새로운 인스턴스
    public Product create(String prototypeName){
        Product p=showcase.get(prototypeName); // Map 추출
        return p.createCopy();
    }
}
