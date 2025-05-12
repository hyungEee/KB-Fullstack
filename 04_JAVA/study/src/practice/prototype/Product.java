package practice.prototype;

public interface Product extends Cloneable{
    void use(String content);
    Product createCopy();
}
