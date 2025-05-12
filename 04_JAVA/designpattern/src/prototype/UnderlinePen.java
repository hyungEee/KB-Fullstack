package prototype;

public class UnderlinePen implements Product{
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {

    }

    @Override
    public Product createCopy() {
        return null;
    }
}
