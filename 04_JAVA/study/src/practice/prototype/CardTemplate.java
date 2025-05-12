package practice.prototype;

public class CardTemplate implements Product{
    String title; // 카드 제목
    String frameChar; // 꾸밈 문자

    public CardTemplate(String title, String frameChar) {
        this.title = title;
        this.frameChar = frameChar;
    }

    @Override
    public void use(String content) {
        System.out.println("["+title+"]");
        for(int i=0;i<30;i++){
            System.out.print(frameChar);
        }
        System.out.println();
        System.out.println(content);
        for(int i=0;i<30;i++){
            System.out.print(frameChar);
        }
        System.out.println();
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p=null;

        try{
            p=(Product) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return title;
    }
}
