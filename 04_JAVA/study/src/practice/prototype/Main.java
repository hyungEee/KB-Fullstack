package practice.prototype;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager();

        manager.register("insta",new CardTemplate("Instagram Story","*"));
        manager.register("twit",new CardTemplate("Tweet Style","-"));
        manager.register("shorts",new CardTemplate("Youtube Shorts","#"));

        Product p1=manager.create("insta");
        Product p2=manager.create("twit");
        Product p3=manager.create("shorts");

        Scanner sc=new Scanner(System.in);
        Map<Product,String> plist=new HashMap<>();
        while(true){
            manager.printRegisterdStyles();
            System.out.print("사용할 스타일 이름 입력 (종료: exit): ");
            String style=sc.nextLine();
            if(style.equals("exit")){
                break;
            }
            System.out.print("출력할 문구 입력: ");
            String str=sc.nextLine();

            try {
                Product p=manager.create(style);
                p.use(str);
                plist.put(p,str);
            }catch (Exception e){
                System.out.println("[Error] 등록되지 않은 스타일입니다: "+style+"\n");
            }
        }

        System.out.println("\n\uD83D\uDCE6 사용된 카드 목록 출력: \n");
        Iterator<Map.Entry<Product,String>> it=plist.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Product,String> entrySet = it.next();
            entrySet.getKey().use(entrySet.getValue());
            System.out.println();
        }

    }
}
