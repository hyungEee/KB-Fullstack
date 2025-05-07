package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory=new IDCardFactory();
        Product card1=factory.create("Youngjin Kim");
        Product card2=factory.create("Heunmin Son");
        Product card3=factory.create("Kane");
        System.out.println();

        card1.use();
        card2.use();
        card3.use();
    }
}
